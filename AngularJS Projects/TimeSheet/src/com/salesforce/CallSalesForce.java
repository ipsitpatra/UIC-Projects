package com.salesforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * 
 */

/**
 * @author Ipsit
 *
 */
public class CallSalesForce {


	//Holds URI returned from OAuth call, which is then used throughout the code.
	 static String baseUri;

	//The oauthHeader set in the oauth2Login method, and then added to
	//each HTTP object that is used to invoke the REST API.
	 static Header oauthHeader;

	//Basic header information added to each HTTP object that is used
	//to invoke the REST API.
	 static Header prettyPrintHeader = new BasicHeader("X-PrettyPrint", "1");


	private static String OAUTH_ENDPOINT = "/services/oauth2/token";
	private static String REST_ENDPOINT = "/services/data";


	public static HttpResponse oauth2Login() {
		System.out.println("_______________ Login OAUTH2_______________");
		OAuth2Response oauth2Response = null;
		HttpResponse response = null;
		User userCredentials = new User();
		String loginHostUri = "https://" + userCredentials.loginInstanceDomain + OAUTH_ENDPOINT;

		try {
			//Construct the objects for making the request
			HttpClient httpClient = new DefaultHttpClient();
			HttpPost httpPost = new HttpPost(loginHostUri);
			StringBuffer requestBodyText = new StringBuffer("grant_type=password");
			requestBodyText.append("&username=");
			requestBodyText.append(userCredentials.userName);
			requestBodyText.append("&password=");
			requestBodyText.append(userCredentials.password);
			requestBodyText.append("&client_id=");
			requestBodyText.append(userCredentials.consumerKey);
			requestBodyText.append("&client_secret=");
			requestBodyText.append(userCredentials.consumerSecret);
			System.out.println("Login Call: "+requestBodyText.toString());
			StringEntity requestBody = new StringEntity(requestBodyText.toString());
			requestBody.setContentType("application/x-www-form-urlencoded");
			httpPost.setEntity(requestBody);
			httpPost.addHeader(prettyPrintHeader);

			//Make the request and store the result
			response = httpClient.execute(httpPost);

			//Parse the result if we were able to connect. 
			if (  response.getStatusLine().getStatusCode() == 200 ) {
				String response_string = EntityUtils.toString(response.getEntity());
				try {
					JSONObject json = new JSONObject(response_string);
					oauth2Response = new OAuth2Response(json);
					System.out.println("JSON returned by response: +\n" + json.toString(1));
				} catch (JSONException je) {
					je.printStackTrace();
				}  
				baseUri = oauth2Response.instance_url + REST_ENDPOINT + "/v" + userCredentials.apiVersion +".0";
				oauthHeader = new BasicHeader("Authorization", "OAuth " + oauth2Response.access_token);
				System.out.println("\nSuccessfully logged in to instance: " + baseUri);
			} else {
				System.out.println("An error has occured. Http status: " + response.getStatusLine().getStatusCode());
				System.out.println(getBody(response.getEntity().getContent()));
//				System.exit(-1);
			}
		} catch (UnsupportedEncodingException uee) {
			uee.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return response;
	}

	private static String getBody(InputStream inputStream) {
		String result = "";
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(inputStream)
					);
			String inputLine;
			while ( (inputLine = in.readLine() ) != null ) {
				result += inputLine;
				result += "\n";
			}
			in.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return result;
	}

	/**
	 * This class is used to hold values returned by the OAuth request.
	 */
	static class OAuth2Response {
		String id;
		String issued_at;
		String instance_url;
		String signature;
		String access_token;

		public OAuth2Response() {
		}
		public OAuth2Response(JSONObject json) {
			try {
				id =json.getString("id");
				issued_at = json.getString("issued_at");
				instance_url = json.getString("instance_url");
				signature = json.getString("signature");
				access_token = json.getString("access_token");

			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static JSONObject restPost(JSONObject newObj) {
		System.out.println("\n_______________ Time Sheet PUT _______________");		
		String uri = baseUri + "/sobjects/Time_Sheet__c/";
		try {

			System.out.println("JSON for TimeSheet record to be inserted:\n" + newObj.toString(1));

			//Construct the objects needed for the request
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost httpPost = new HttpPost(uri);
			httpPost.addHeader(oauthHeader);
			httpPost.addHeader(prettyPrintHeader);
			// The message we are going to post
			StringEntity body = new StringEntity(newObj.toString(1));
			body.setContentType("application/json");
			httpPost.setEntity(body);

			//Make the request
			HttpResponse response = httpClient.execute(httpPost);
			JSONObject json = null;;
			//Process the results
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 201) {
				String response_string = EntityUtils.toString(response.getEntity());
				json = new JSONObject(response_string);
				System.out.println("New Entry id from response: "+json.toString());     	  
			} else {
				System.out.println("Insertion unsuccessful. Status code returned is " + statusCode);
			}
			return json;
		} catch (JSONException e) {
			System.out.println("Issue creating JSON or processing results");
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		return null;
	}

}

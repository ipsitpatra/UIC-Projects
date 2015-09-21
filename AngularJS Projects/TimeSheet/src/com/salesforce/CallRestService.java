package com.salesforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.ParseException;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Servlet implementation class CallRestService
 */
@WebServlet("/CallRestService")
public class CallRestService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CallRestService() {
        super();
        System.out.println("_______________ AngularJS call _______________");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("_______________ AngularJS POST call _______________");
		CallSalesForce.oauth2Login();
		try {
			  StringBuffer jb = new StringBuffer();
			  String line = null;
			  try {
			    BufferedReader reader = request.getReader();
			    while ((line = reader.readLine()) != null)
			      jb.append(line);
			  } catch (Exception e) { /*report an error*/ }

			  try {
			    JSONObject jsonObject = new JSONObject(jb.toString());
			    System.out.println(jsonObject);
			    jsonObject = CallSalesForce.restPost(jsonObject);
			    System.out.println(jsonObject);
			    response.setContentType("application/json");
			    PrintWriter out = response.getWriter();
			    out.print(jsonObject);
			    out.flush();
			  } catch (ParseException e) {
			    throw new IOException("Error parsing JSON request string");
			  }
//			System.out.println(request.getParameter("data"));
//			JSONObject jObj = new JSONObject(request.getParameter("data"));
//			CallSalesForce.restPost(jObj);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package edu.uic.cs478.ipsit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityProject1 extends Activity
{

	private String data;
	private TextView editText2;
	private Button search;
	private Button exit;
	private Button clear;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//Binding the Button and the textField for the event
		editText2 = (TextView)findViewById(R.id.editText2);
		search = (Button)findViewById(R.id.search);
		exit = (Button)findViewById(R.id.exit);
		clear = (Button)findViewById(R.id.clear);

		//Action for the button on Event
		search.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				data = editText2.getText().toString();
				System.out.println("Data Received :"+data);
				//Configuration for Toast
				Context context = getApplicationContext();
				CharSequence text = "";
				int duration = Toast.LENGTH_SHORT;


				//Calling function to extract the number, if found return number else null
				if(extractNumber(data)!=null){
					text = "Number Found\n"+ extractNumber(data);
					//Provide Feedback
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();

					//Host the application
					Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+extractNumber(data)));
					startActivity(intent);
				}
				else{
					text = "  Not Found\n(xxx) yyy-zzzz";
					//Provide Feedback
					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}
			}
		});


		//Action for the button on Event clear
		clear.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//Configuration for Toast
				Context context = getApplicationContext();
				CharSequence text = "Cleared";
				int duration = Toast.LENGTH_SHORT;

				//Provide Feedback
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				//Field cleared
				editText2.setText("");
			}	
		});



		// Exit Button Action for the button on Event
		exit.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				exit();
				
			}
		});

	}

	
	private void exit(){
		new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit Project 1 ")
		.setMessage("Do you want to Exit ?")
		.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Context context = getApplicationContext();
				CharSequence text = "Thank You";
				int duration = Toast.LENGTH_SHORT;
				//Give feed back before exiting
				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				//Navigate to Home
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
				finish();
			}
		}).setNegativeButton("No", null).show();
	}

	//Back Press exit 
	@Override
	public void onBackPressed() {
		//invoke Exit function
		exit();
	} 

	private String extractNumber(String data){

		//Extracting (xxx) yyy-zzzz number
		Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");
		Matcher matcher = pattern.matcher(data);
		if (matcher.find()) {
			return matcher.group(0);
		}
		else
			return null;
	}
}

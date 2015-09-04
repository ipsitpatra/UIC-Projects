package edu.uic.cs478.ipsit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class Project2 extends Activity
{
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		//taking configuration from mail.xml
		setContentView(R.layout.main);
		GridView gridView = (GridView)findViewById(R.id.gridview);
		
		//Setting the image adapter with image and url details
		gridView.setAdapter(new Project2ImageAdapter(this));
		/* On Click event for Single Gridview Item */
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				//Give feed back before new activity begins
				Toast.makeText(getApplicationContext(),"Opening Picture",Toast.LENGTH_LONG).show();
				//Creating a new intent and starting the activity
				Intent intent = new Intent(getApplicationContext(), Project2FullImage.class);
				intent.putExtra("id", position);
				//starting the new activity
				startActivity(intent);
			}
		});

		//On long click set to true
		gridView.setLongClickable(true);
		//listener for the log click on the grid image
		gridView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				android.widget.GridView gridView = (android.widget.GridView) findViewById(R.id.gridview);
				registerForContextMenu(gridView);
				openContextMenu(gridView);
				return false;
			}

		});
	}  

	//Creating the context menu
	@Override   
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)  
	{  
		super.onCreateContextMenu(menu, v, menuInfo);  
		menu.setHeaderTitle("Select The Action");    
		//groupId, itemId, order, title
		menu.add(0, v.getId(), 0, "View Picture");   
		menu.add(0, v.getId(), 0, "Display Details");   
	}   
	
	//on menu selection
	@Override    
	public boolean onContextItemSelected(MenuItem item){    
		AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		//  info.position will give the index of selected item
		int index=info.position;             
		if(item.getTitle()=="View Picture"){  
			//Give feed back before new activity begins
			Toast.makeText(getApplicationContext(),"Opening Picture",Toast.LENGTH_LONG).show();  
/*			android.widget.GridView gridView = (android.widget.GridView) findViewById(R.id.gridview);
			gridView.setAdapter(new Project2ImageAdapter(this));*/
			//Create Intent to pass on the information 
			Intent intent = new Intent(getApplicationContext(), Project2FullImage.class);
			intent.putExtra("id", index);
			startActivity(intent);

		}    
		else if(item.getTitle()=="Display Details"){  
			//Give feed back before new activity begins
			Toast.makeText(getApplicationContext(),"Displaying Details",Toast.LENGTH_LONG).show();
			Project2ImageAdapter urlAdapter = new Project2ImageAdapter(this);
			//fetching URL information from the adapter
			String url = ((Project2Item)urlAdapter.getItem(index)).url;
			Intent i = new Intent(Intent.ACTION_VIEW);
			//passing the url string to the new activity via intent
			i.setData(Uri.parse(url));
			//Starting new activity
			startActivity(i); 
		}else{  
			return false;  
		}    
		return true;    
	}    

	//invoked when back button is pressed from the grid activity
	private void exit(){
		new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit Project 2 ")
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

}

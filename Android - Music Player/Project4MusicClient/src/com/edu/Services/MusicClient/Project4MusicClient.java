package com.edu.Services.MusicClient;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.Services.MusicCommon.Project4MusicService;

public class Project4MusicClient extends Activity {

	private Project4MusicService project4MusicService;
	private boolean isBound;
	protected static final String TAG = "Project4MusicService";
	private final static String BROADCAST_NAME = "com.edu.Services.Project4ServiceBroadcast";
	private final static String PACKAGE_NAME = "com.edu.Services.MusicService";
	private final static String CLASS_NAME = "com.edu.Services.MusicService.Project4MusicServiceImpl";
	private final static int NO_RES_ID = 0;
	private final static int PLAY = 1;
	private final static int STOP = 4;
	private final static int PAUSE = 2;
	private final static int RESUME = 3;
	private final static int RELEASE = 5;

	private boolean bindFlag;
	private int defaultSong = 0;
	private List<String> log = new ArrayList<String>();
	private IntentFilter bFilter;

	private Button select1Button = null;
	private Button select2Button = null;
	private Button select3Button = null;
	private Button select4Button = null;
	private Button select5Button = null;
	private Button playButton = null;
	private Button logButton = null;
	private Button stopButton = null;
	private TextView songselected = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//Get the button instances
		select1Button = (Button) findViewById(R.id.play1);
		select2Button = (Button) findViewById(R.id.play2);
		select3Button = (Button) findViewById(R.id.play3);
		select4Button = (Button) findViewById(R.id.play4);
		select5Button = (Button) findViewById(R.id.play5);
		playButton = (Button) findViewById(R.id.play);
		playButton.setTag(PLAY);
		logButton = (Button) findViewById(R.id.logTransactions);
		stopButton = (Button) findViewById(R.id.stop);
		//Set the text of Pause/Resume button
//		switchTagToPlay();
		
		songselected = (TextView) findViewById(R.id.songselected);
		songselected.setText("Default Song 1 Selected");
		

		try{
			//Intent to bind the service
			Intent intent = new Intent(Project4MusicService.class.getName());
			//Set the package name and class name to the intent
			intent.setClassName(PACKAGE_NAME, CLASS_NAME);
			//bind the service to the activity
			bindFlag = bindService(intent,this.mConnection, Context.BIND_AUTO_CREATE);
			Log.i(TAG, "Binding Complete : "+bindFlag);
		}catch(Exception e){
			Log.e(TAG, e.toString());
		}
		//Create the intent filter for broadcast receiver
		bFilter = new IntentFilter(BROADCAST_NAME);
		//Register the receiver
		registerReceiver(Project4MusicServiceReceiver, bFilter);
		playButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(isBound){
						
						final int status = (Integer) playButton.getTag();
						Log.e(TAG, "Invoked : Play Method "+status);
						if(status == PAUSE && project4MusicService.isPlaying()){
							//call the service to pause the song
							project4MusicService.playSong(NO_RES_ID, PAUSE);
							//If status is 0 which means pause then change to resume when hit on pause
							switchTagToResume();
						}else if(status == RESUME){
							//call the service to resume the song
							project4MusicService.playSong(NO_RES_ID, RESUME);
							//If status is 1 which means resume then change to pause when hit on resume
							switchTagToPause();
						}else if(status == PLAY){
							//Set the Play button text to "Play" when STOP is clicked
							switchTagToPause();
							String msg = "Now Playing Song : "+(defaultSong+1);
							Log.e(TAG, "Invoked : Play Method");
							project4MusicService.playSong(defaultSong, PLAY);
							Toast toast = Toast.makeText(getApplicationContext() , msg, Toast.LENGTH_SHORT);
							toast.show();}
					}

				}catch (Exception e){
					Log.e(TAG, e.toString());
					e.printStackTrace();
				}

			}
		});

		select1Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				defaultSong = 0;
				songselected.setText("Song 1 Selected");
				try {
					project4MusicService.playSong(NO_RES_ID, STOP);
					/*Changing Tag to Play*/
					switchTagToPlay();
				} catch (RemoteException e) {
					Log.e(TAG,"RemoteException");
				}
			}
		});
		select2Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				songselected.setText("Song 2 Selected");
				defaultSong = 1;
				try {
					project4MusicService.playSong(NO_RES_ID, STOP);
					/*Changing Tag to Play*/
					switchTagToPlay();
				} catch (RemoteException e) {
					Log.e(TAG,"RemoteException");
				}
			}
		});
		select3Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				songselected.setText("Song 3 Selected");
				defaultSong = 2;
				try {
					project4MusicService.playSong(NO_RES_ID, STOP);
					/*Changing Tag to Play*/
					switchTagToPlay();
				} catch (RemoteException e) {
					Log.e(TAG,"RemoteException");
				}
			}
		});
		select4Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				songselected.setText("Song 4 Selected");
				defaultSong = 3;
				try {
					project4MusicService.playSong(NO_RES_ID, STOP);
					/*Changing Tag to Play*/
					switchTagToPlay();
				} catch (RemoteException e) {
					Log.e(TAG,"RemoteException");
				}
			}
		});
		select5Button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				songselected.setText("Song 5 Selected");
				defaultSong = 4;
				try {
					project4MusicService.playSong(NO_RES_ID, STOP);
					switchTagToPlay();
				} catch (RemoteException e) {
					Log.e(TAG,"RemoteException");
				}
			}
		});


		stopButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(isBound){
						//Set the text to pause
						switchTagToPlay();
						//call the service to stop the song
						project4MusicService.playSong(NO_RES_ID, STOP);
						switchTagToPlay();
					}

				}catch (Exception e){
					Log.e(TAG, e.toString());
				}

			}
		});
		/*Transaction Declared*/
		logButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(isBound){
						/*Retrieve all the SQLite records*/ 
						log = project4MusicService.getLog();
						/*Creating the bundle and placing logTransactions object into it*/
						Bundle bundle = new Bundle();
						bundle.putStringArrayList("logTransactions", (ArrayList<String>)log);
						/*Creating an intent for second activity and pass the logTransactions bundle to the intent*/
						Intent i = new Intent(getApplicationContext(),LogTransactions.class);
						i.putExtras(bundle);
						/*Invoke the activity*/
						startActivity(i);
					}

				}catch (Exception e){
					Log.e(TAG, "Log Issue "+e.toString());
				}
			}
		});
	}

	/*Changing tags from Play to Resume to Stop*/
	private void switchTagToResume(){
		songselected.setText("Song "+(defaultSong+1)+" Paused");
		playButton.setTag(RESUME);
		playButton.setText("Resume");
	}

	private void switchTagToPause(){
		songselected.setText("Song "+(defaultSong+1)+" Resumed");
		playButton.setTag(PAUSE);
		playButton.setText("Pause");
	}

	private void switchTagToPlay(){
		playButton.setTag(PLAY);
		playButton.setText("Play");
	}

	/*Project4MusicServiceReceiver Declared*/
	private final BroadcastReceiver Project4MusicServiceReceiver = new BroadcastReceiver(){

		@Override
		public void onReceive(Context context, Intent intent) {
			//Listen for the broadcast which is sent by the service
			Log.e(TAG, "BroadcastReceiver Invoked");
			if(intent.getAction().equalsIgnoreCase(BROADCAST_NAME))
			{
				// Set the text for the toast
				String text = "Project4MusicService: Song Complete";
				int duration = Toast.LENGTH_LONG;
				Log.i(TAG, "BroadcastReceiver Toast");
				Toast toast = Toast.makeText(getApplicationContext(), text, duration);
				//show the toast
				toast.show();
				switchTagToPlay();
			}
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if(isFinishing()){
			//Unregister the Receiver Service
			unregisterReceiver(Project4MusicServiceReceiver);
			if (isBound) 
				try{
					//Stop Player
					project4MusicService.playSong(NO_RES_ID, RELEASE);
					//Clear SQLlite
					project4MusicService.clearLog();
					unbindService(this.mConnection);
				}catch(Exception e){
					Log.e(TAG, e.toString());
				}
		}
	}

	private final ServiceConnection mConnection = new ServiceConnection() {

		@Override
		public void onServiceConnected(ComponentName classname, IBinder iservice) {
			//get the stub as interface
			project4MusicService = Project4MusicService.Stub.asInterface(iservice);
			//set is bound to true
			isBound = true;
			Log.i(TAG, "Service connected");
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			//on service disconnected, set the service to null and is bound to false
			project4MusicService = null;
			isBound = false;
		}
	};
	
	//Back Press exit 
	@Override
	public void onBackPressed() {
		//invoke Exit function
		exit();
	} 
	
	private void exit(){
		new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit Project 4 ")
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
	
}

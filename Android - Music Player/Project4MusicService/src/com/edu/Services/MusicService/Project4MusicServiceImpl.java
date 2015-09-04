package com.edu.Services.MusicService;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.edu.Services.MusicCommon.Project4MusicService;
import com.edu.Services.SQLite.SQLConnector;


public class Project4MusicServiceImpl extends Service {

	private final static String TAG ="Project4ServiceImpl";
	private final static String BROADCAST_NAME ="com.edu.Services.Project4ServiceBroadcast";
	private final static int NO_RES_ID = 0;
	private final static int PLAY = 1;
	private final static int STOP = 4;
	private final static int PAUSE = 2;
	private final static int RESUME = 3;
	private final static int RELEASE = 5;
	private MediaPlayer mediaPlayer = new MediaPlayer();
	private int seek;
	private SQLConnector sqlConnector;
	private List<String> log = null;
	private List<Integer> listOfSongs=new ArrayList<Integer>();
	/*Broadcast function*/
	private void broadCast(){
		Intent intent = new Intent();
		intent.setAction(BROADCAST_NAME);
		sendBroadcast(intent);
	}
	/*Using reflection to get file information*/
	/*To list all the names of your raw assets, which are basically the filenames with the extensions stripped off*/
	public List<Integer> listRaw(){
		Field[] fields=R.raw.class.getFields();
		Log.i(TAG, "No. of fields : "+fields.length);
		for(int count=0; count < fields.length; count++){
			try {
				/*Convert back to Integer to get the Resource id*/
				listOfSongs.add(fields[count].getInt(fields[count]));
			} catch (IllegalAccessException e) {
				Log.e(TAG, e.getMessage());
			} catch (IllegalArgumentException e) {
				Log.e(TAG, e.getMessage());
			}
			Log.i(TAG, "List generated "+ fields[count].getName());
		}

		return listOfSongs;
	}
	/*Operation of Media player*/
	protected void play(int id, int action) {
		String msg = "";
		Log.i(TAG, "Play Invoked "+action);
		/*action 1 : play*/
		if(action == PLAY){
			//Stop the player if its already playing
			if(mediaPlayer.isPlaying())
				mediaPlayer.stop();
			msg = "Playing song no. : "+(id+1);
			Log.i(TAG, msg);
			mediaPlayer = MediaPlayer.create(getApplicationContext(), listOfSongs.get(id));
			mediaPlayer.start();
			mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

				@Override
				public void onCompletion(MediaPlayer mp) {
					/*Song complete: send GLOBAL broadcast*/
					broadCast();

				}
			});
			msg = "Song Complete";
		}
		/*action 2 : pause*/
		if(action == PAUSE){
			msg = "Paused : song no.: "+(id+1);
			mediaPlayer.pause();
			//get the current position where the song is stopped
			seek = mediaPlayer.getCurrentPosition();}
		/*action 3 : resume*/
		if(action == RESUME){
			msg = "Resuming song no. : "+(id+1);
			mediaPlayer.seekTo(seek);
			mediaPlayer.start();
		}
		/*action 4 : stop*/
		if(action == STOP){
			msg = "Stopping song no. : "+(id+1);
			mediaPlayer.stop();}
		/*action 5 : release*/
		if(action == RELEASE){
			msg = "Release Player";
			mediaPlayer.release();}

		//Enter log
		logFunction(id, action, msg);
	}
	/*Database Log*/
	private void logFunction(int id, int action, String msg){

		String tmpMsg =(action == PLAY) ? "PLAY" : (action == STOP) ? "STOP" : (action == PAUSE) ? "PAUSE" : "RESUME" ;
		sqlConnector = new SQLConnector(getBaseContext());
		sqlConnector.open();
		//insert the data into the database
		sqlConnector.insertData(getDate(), getTimeStamp(),tmpMsg,Integer.toString((id+1)), msg);
		sqlConnector.close();
	}
	/*Getting TimeStamp*/
	@SuppressLint("SimpleDateFormat") public String getTimeStamp(){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(c.getTime());
	}

	/*Getting Date*/ 
	public String getDate(){
		Calendar calendar = Calendar.getInstance();
		/*Date in mm/dd/yyyy format*/
		return Integer.toString(calendar.get(Calendar.MONTH)+1)+"/"+Integer.toString(calendar.get(Calendar.DAY_OF_MONTH))+"/"+Integer.toString(calendar.get(Calendar.YEAR));
	}
	/*Stub Implementations*/
	private final Project4MusicService.Stub mBinder = new Project4MusicService.Stub(){


		public void playSong(int id, int action) throws RemoteException{
			Log.i(TAG, "playSong Method Invoked");
			/*MusicPlayer Invocation*/
			play(id, action);
		}

		@Override
		public boolean isPlaying() throws RemoteException {
			/*Flag to Check current state*/
			return mediaPlayer.isPlaying();
		}

		@Override
		public List<String> getLog() throws RemoteException {
			log = new ArrayList<String>();
			sqlConnector = new SQLConnector(getBaseContext());
			sqlConnector.open();
			/*Navigate through the table*/
			Cursor c = sqlConnector.returnData();
			if(c.moveToFirst())
				do
					log.add("Date : "+c.getString(0)+" | "+"Time : "+c.getString(1)+" | "+"Action : "+c.getString(2)+" | "+"Song No : "+c.getString(3)+" | "+"Status :"+c.getString(4));
				while(c.moveToNext());
			sqlConnector.close();
			//return the records in a List<String>
			return log;
		}

		@Override
		public void clearLog() throws RemoteException {
			sqlConnector = new SQLConnector(getBaseContext());
			sqlConnector.open();
			//delete all the data
			sqlConnector.deleteData();
			sqlConnector.close();
		}
	};

	@Override
	public IBinder onBind(Intent intent) {
		/*Getting List using Reflection during binding*/
		listOfSongs= listRaw();
		return mBinder;
	}

}

package com.edu.Services.MusicClient;

import java.util.List;

import com.edu.Services.MusicClient.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class LogTransactions extends ListActivity {
	
	private List<String> log;
	private ArrayAdapter<String> logAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*Getting Layout*/
		setContentView(R.layout.logtransactions);
		//Getting Logs in Bundle
		Bundle b = this.getIntent().getExtras();
		log = b.getStringArrayList("logTransactions");
		/*initiate and assign the list adapter*/
		logAdapter = new ArrayAdapter <String>(this,R.layout.layout,R.id.listText, log);
		setListAdapter(logAdapter);

	}

	/**
	 * @return the log
	 */
	public List<String> getLog() {
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(List<String> log) {
		this.log = log;
	}

	/**
	 * @return the logAdapter
	 */
	public ArrayAdapter<String> getLogAdapter() {
		return logAdapter;
	}

	/**
	 * @param logAdapter the logAdapter to set
	 */
	public void setLogAdapter(ArrayAdapter<String> logAdapter) {
		this.logAdapter = logAdapter;
	}
}

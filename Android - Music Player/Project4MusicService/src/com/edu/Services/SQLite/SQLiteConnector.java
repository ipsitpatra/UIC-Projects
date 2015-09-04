package com.edu.Services.SQLite;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConnector  extends SQLiteOpenHelper{
	
	public static final int DATABASE_VERSION = 1;
	public static final String DATA_BASE_NAME = "project4DB";
	public static final String TABLE_CREATE = "create table "+SQLConnector.TABLE_NAME+" (date text not null,time text not null,kind text not null,number text not null,current text not null);";	
	public SQLiteConnector(Context context) {
		super(context,DATA_BASE_NAME,null,DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		try{
		//create the table
		db.execSQL(TABLE_CREATE);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//execute the query on upgrade
		db.execSQL("DROP TABLE IF EXISTS "+SQLConnector.TABLE_NAME+"");
		onCreate(db);
	}
	
}

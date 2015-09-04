package com.edu.Services.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class SQLConnector {
	public static final String DATE = "date";
	public static final String TIME = "time";
	public static final String KIND = "kind";
	public static final String NUMBER = "number";
	public static final String CURRENT = "current";
	public static final String TABLE_NAME = "project4";
	

	//create a helper instance
	SQLiteConnector sqlliteConnector;
	//create a context variable
	Context context;
	//create a SQLite instance
	SQLiteDatabase db;
	
	public SQLConnector(Context context){
		//assign the context and database helper in the constructor
		this.context = context;
		sqlliteConnector = new SQLiteConnector(context);
	}
	
	
	public SQLConnector open(){
		//open the database
		db = sqlliteConnector.getWritableDatabase();
		return this;
	}
	
	public long insertData(String date,String time,String kind,String number,String current){
		ContentValues content = new ContentValues();
		//insert the values in the content
		content.put(DATE, date);
		content.put(TIME, time);
		content.put(KIND, kind);
		content.put(NUMBER, number);
		content.put(CURRENT, current);
		return db.insertOrThrow(TABLE_NAME, null, content);
	}
	
	public Cursor returnData(){
		//execute the query for select
		return db.query(TABLE_NAME, new String[]{DATE,TIME,KIND,NUMBER,CURRENT},null,null,null,null,null);
	}
	
	public void deleteData(){
		//delete all the records from the table
		db.execSQL(" delete from "+ TABLE_NAME);
	}

	public void close(){
		//close the database
		sqlliteConnector.close();
	}
	
}

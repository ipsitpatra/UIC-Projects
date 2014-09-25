package com.moviestheater;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class MoviesTheaterImpl extends UnicastRemoteObject implements MoviesTheaterInterface{

	
	
	public MoviesTheaterImpl() throws RemoteException{
		
	}
	
	public ArrayList<String> getMoviesTheaterList() throws RemoteException {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1. River East 21");
		list.add("2. Ford City 14");
		list.add("3. Loews 600 North Michigan 9");
		list.add("4. Mesa Grand 24");
		
		return list;
	}

}

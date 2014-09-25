package com.moviestheater;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MoviesImpl extends UnicastRemoteObject implements MoviesInterface{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 62824245095187592L;

	public MoviesImpl() throws RemoteException{
		
	}
	
	public Map<Integer,ArrayList<Movies>> getMoviesList() throws RemoteException {
		
		Map<Integer,ArrayList<Movies>>  map=new HashMap<Integer, ArrayList<Movies>>();
		ArrayList<Movies> list = new ArrayList<Movies>();
		Movies movie1 = new Movies();
		movie1.setMovieLanguage("English");
		movie1.setMovieName("se7en");
		movie1.setMovieTimings("8:30am-12 noon");
		list.add(movie1);
		
		map.put(1, list);
		
		return map;
	}

}

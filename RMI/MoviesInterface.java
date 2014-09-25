package com.moviestheater;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

public interface MoviesInterface extends Remote{

	public Map<Integer,ArrayList<Movies>> getMoviesList() throws RemoteException;
	
	
	
	
	
	
}

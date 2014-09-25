package com.moviestheater;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface MoviesTheaterInterface extends Remote{

	public ArrayList<String> getMoviesTheaterList() throws RemoteException;
	
	
	
	
	
	
}

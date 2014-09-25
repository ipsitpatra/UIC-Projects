package com.moviestheater;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookMovieInterface extends Remote{

	public void getMoviesTheaterList(Movies movies) throws RemoteException;
	
	
	
	
	
	
}

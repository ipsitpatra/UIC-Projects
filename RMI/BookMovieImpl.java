package com.moviestheater;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BookMovieImpl extends UnicastRemoteObject implements BookMovieInterface{

	
	
	public BookMovieImpl() throws RemoteException{
		
	}
	
	public void getMoviesTheaterList(Movies movies) throws RemoteException {
		
		Registry reg = LocateRegistry.getRegistry(null);
		try {
			BookMovieInterface book =  (BookMovieInterface)reg.lookup("BookMovieList");
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		System.out.println(movies.getMovieLanguage());
	}

}

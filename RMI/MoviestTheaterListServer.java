package com.moviestheater;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class MoviestTheaterListServer {

	
	public static void main(String[] args) {
		
		try{
			
			Registry registry = null;
			try {
			    registry = LocateRegistry.createRegistry(1099);
			} catch (ExportException ex) {
			   registry = LocateRegistry.getRegistry(1099);
			} catch (RemoteException ex) {
//			  Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			
			MoviesTheaterImpl moviesTheaterImpl = new MoviesTheaterImpl();
			registry.bind("MoviestTheaterList", moviesTheaterImpl);
			
			System.out.println("MoviestTheaterListServer running");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
	}

}

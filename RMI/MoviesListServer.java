package com.moviestheater;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class MoviesListServer {

	
	public static void main(String[] args) {
		
		try{
			
			Registry registry = null; //LocateRegistry.getRegistry();
			try {
			    registry = LocateRegistry.createRegistry(1099);
			} catch (ExportException ex) {
			   registry = LocateRegistry.getRegistry(1099);
			} catch (RemoteException ex) {
//			  Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
			}
			MoviesImpl moviesImpl = new MoviesImpl();
			registry.bind("MoviesList", moviesImpl);
			
			System.out.println("MoviestListServer running");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
	}

}

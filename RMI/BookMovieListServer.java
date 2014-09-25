package com.moviestheater;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;

public class BookMovieListServer {

	
	public static void main(String[] args) {
		
		try{
			
//			Registry reg = LocateRegistry.createRegistry(1099);//getRegistry();
			
			Registry registry = null;
			try {
			    registry = LocateRegistry.createRegistry(1099);
			} catch (ExportException ex) {
			   registry = LocateRegistry.getRegistry(1099);
			} catch (RemoteException ex) {
//			  Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			BookMovieImpl bookMovieImpl = new BookMovieImpl();
			registry.rebind("BookMovieList", bookMovieImpl);
			
			
			
			
			
			
			
			
			
			System.out.println("BookMovieListServer running");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
	}

}

package com.moviestheater;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Iterator;
import java.util.Scanner;

public class MoviesClient {



	public static void main(String[] args) {


		try{
//			Movies tmp = new Movies(); 
			Registry reg = LocateRegistry.getRegistry(null);
			
			MoviesTheaterInterface moviesTheater =  (MoviesTheaterInterface)reg.lookup("MoviestTheaterList");
			Iterator<String> itTheater = moviesTheater.getMoviesTheaterList().iterator();
			
			System.out.println("Movies Theater List :");
			while(itTheater.hasNext())
				System.out.println(itTheater.next());
			
			Scanner input = new Scanner(System.in);
			String num = input.next();
			if(Integer.parseInt(num)!=1 && Integer.parseInt(num)!=2 && Integer.parseInt(num)!=3 && Integer.parseInt(num)!=3){
				System.out.println("Not a valid number");
				System.out.println("Please run the application again!!");
				input.close();
				return;
			}
			
			
			
			
			
			
			input.close();
			/*System.out.println(moviesTheater.getMoviesTheaterList().get(0));
			MoviesInterface movies =  (MoviesInterface)reg.lookup("MoviesList");
			System.out.println(movies.getMoviesList());
			BookMovieInterface book =  (BookMovieInterface)reg.lookup("BookMovieList");
			book.getMoviesTheaterList(tmp);*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

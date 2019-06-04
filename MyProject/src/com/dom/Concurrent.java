package com.dom;

public class Concurrent {

	public static void main(String[] args)  {
		
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		Brush brush = new Brush();
		Thread thread = new Thread(brush);
		thread.start();
		try {
			thread.join();
		}catch(Exception e) {
			
		}
	}

}

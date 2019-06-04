package com.dom;

public class Wizard extends Thread{

	public void thunder()  {
		System.out.println("THUNDER START!!");
		try {
			sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println("END!!");
	}
	public void run() {
		thunder();
	}
	
	
	public static void main (String[] args) {
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		w1.thunder();
		w2.thunder();
		
		
	}
	
}
	
	
	


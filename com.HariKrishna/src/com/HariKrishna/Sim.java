package com.HariKrishna;

/* 
 * This program is to show the significance of Default key word in the interface . It has defined body declaration within the interaface
 * One other thing is make note of the use of loose cuppling. which interaface variable refering different methods in memory.
 * */

public interface Sim {
	
	
	void Call();
	void sms();
	public default void vedioStreaming() {
		
		System.out.println("From default block we get addittional functionality");
	}

}
class Airtel implements Sim {

	@Override
	public void Call() {
		System.out.println("Calling from airtel");
	}

	@Override
	public void sms() {
		System.out.println("Sending message from airtel");
		
	}	
	
	public void vedioStreaming() {
		
		System.out.println("Here we made override the default method from interface");
	}
	
	
} 

class Motorolla implements Sim {

	@Override
	public void Call() {
		System.out.println("Calling from Motorolla");
	}

	@Override
	public void sms() {
		System.out.println("Sending message from Motorolla");
		
	}	
	
	
} 
class Mobile{                         //loose cuppling
	void insertSim(Sim sim) {
		sim.Call();
		sim.sms();
		sim.vedioStreaming();
	}
	
	
}

class Customer{
	
	public static void main(String[] args) {
		
		Mobile iPhone = new Mobile();
		iPhone.insertSim(new Airtel());
		Mobile motorolla = new Mobile();
		motorolla.insertSim(new Motorolla());  //you are creating an object with the new key word.
		
	}
	
	
	
}





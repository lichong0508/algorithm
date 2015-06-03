package com.java.PV;

public class Pv {
	public static void main(String args[]){
		SyncStack stack = new SyncStack();
		Producer producer = new Producer(stack);
		Customer customer = new Customer(stack);
		new Thread(producer).start();
		new Thread(customer).start();
	}
}

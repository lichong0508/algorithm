package com.java.PV;

public class Producer implements Runnable{
	/**
	 * 生产者每1s生产一件产品
	 */
	SyncStack stack = new SyncStack();
	public Producer(SyncStack stack){
		this.stack = stack;
	}
	public void run() {
		for(int i = 0; i < 20; i++){
			Product product = new Product(i);
			stack.push(product);
			System.out.println("生产:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

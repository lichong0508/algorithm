package com.java.PV;

public class Customer implements Runnable{
	/**
	 * 消费者每6s消费一件产品
	 */
	SyncStack stack = new SyncStack();
	public Customer(SyncStack stack){
		this.stack = stack;
	}
	public void run() {
		for(int i = 0; i < 20; i++){
			Product product = stack.pop();
			System.out.println("消费：" + product.id);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.java.PV;

public class SyncStack {
	/**
	 * 容器大小为6
	 */
	private int index = 0;
	Product[] arr_product =  new Product[6];
	
	//添加产品
	public synchronized  void push(Product product){
		while(index == arr_product.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		arr_product[index] = product;
		index++;
	}
	//消费产品
	public synchronized Product pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		index--;
		return arr_product[index];
	}
}

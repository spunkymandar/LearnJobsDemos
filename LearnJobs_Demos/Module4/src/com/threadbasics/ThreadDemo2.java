package com.threadbasics;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoked by :"+Thread.currentThread().getName());
	}
	
}

public class ThreadDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		t1.setName("Java-Thread");
		t1.start();
		
	}

}

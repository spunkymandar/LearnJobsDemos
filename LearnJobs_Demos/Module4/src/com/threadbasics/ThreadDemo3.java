package com.threadbasics;

public class ThreadDemo3 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" , "+"Invoked by :"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo3 thread1=new ThreadDemo3();
		ThreadDemo3 thread2=new ThreadDemo3();
		
		thread1.start();
		thread2.start();
		
	}

}

package com.threadbasics;
class Table{
	//if one thread enters in this block, other threads will be kept in waiting
	synchronized static void printTable(int n) {
		for(int i=1;i<=10;i++)
			System.out.println(n*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
class MyThreadFive extends Thread{
	public void run() {
		Table.printTable(5);
	}
}

class MyThreadTen extends Thread{
	public void run() {
		Table.printTable(10);
	}
}

class MyThreadSix extends Thread{
	public void run() {
		Table.printTable(6);
	}
}

class MyThreadSeven extends Thread{
	public void run() {
		Table.printTable(7);
	}
}


public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFive thread1=new MyThreadFive();
		MyThreadTen thread2=new MyThreadTen();
		MyThreadSix thread3=new MyThreadSix();
		MyThreadSeven thread4=new MyThreadSeven();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}

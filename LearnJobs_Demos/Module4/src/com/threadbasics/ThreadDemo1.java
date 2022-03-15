package com.threadbasics;
/*interface Runnable{
 *  void run();
 *}
 *class Thread implements Runnable{
 *  void run(){
 *  }
 *  void start(){
 *  }
 *}
 */
public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println("run method invoked !!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates and instantiates the thread
		ThreadDemo1 td1=new ThreadDemo1();
		
		//thread is pushed into thread pool 
		td1.start();
		

	}

}

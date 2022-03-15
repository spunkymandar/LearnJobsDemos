package com.advancedthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		executor.execute(new Task());
		executor.execute(new Task());
		executor.execute(new Task());
		executor.execute(new Task());
		
		

	}

}
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executuing the task by :"+Thread.currentThread().getName());
	}
}

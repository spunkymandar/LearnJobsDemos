package com.advancedthread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutoDemo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Future<?> f1=executor.submit(new Task1());
		Future<?> f2=executor.submit(new Task1());
		
		System.out.println(f1.get());
		System.out.println(f2.get());

	}

}
class Task1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoked by :"+Thread.currentThread().getName());
	}
	
}

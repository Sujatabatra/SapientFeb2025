package com.sujata.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadJob implements Runnable {

	private String name;

	public ThreadJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " is executing by "+Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " sleep completed in "+Thread.currentThread().getName());

	}

}

public class ExecutorDemoClass {

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		for(int count=1;count<=10;count++) {
			executorService.execute(new ThreadJob("task"+count));
		}

	}

}

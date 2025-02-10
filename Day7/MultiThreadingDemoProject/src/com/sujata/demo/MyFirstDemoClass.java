package com.sujata.demo;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
		System.out.println("good bye from "+Thread.currentThread().getName());
	}
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		
		//New Born
		MyThread childThreadOne=new MyThread();
		MyThread childThreadTwo=new MyThread();
		MyThread childThreadThree=new MyThread();
		
		
		//Ready or Running
		childThreadOne.start();
		childThreadTwo.start();
		childThreadThree.start();
		
		
		for(int count=1;count<=5;count++) {
			System.out.println(Thread.currentThread().getName()+" count : "+count);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}

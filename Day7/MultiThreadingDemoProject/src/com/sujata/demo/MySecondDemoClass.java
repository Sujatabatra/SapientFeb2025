package com.sujata.demo;

class Base{
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}

class Derived extends Base implements Runnable{
	
	public Derived(int number) {
		setNumber(number);
	}
	
	public void print() {
		for(int i=1;i<=getNumber();i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
	}

	//Thread Job
	@Override
	public void run() {
		print();
		
	}
	
}
public class MySecondDemoClass {

	public static void main(String[] args) {
		Thread childOne=new Thread(new Derived(6));
		Thread childtwo=new Thread(new Derived(5));

		childOne.start();
		childtwo.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}

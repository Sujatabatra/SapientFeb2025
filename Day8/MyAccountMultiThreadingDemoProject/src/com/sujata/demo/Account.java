package com.sujata.demo;

public class Account implements Runnable {

	static private int balance = 1000;

	@Override
	public void run() {
//		synchronized (this) {
		synchronized (Account.class) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw , your balance is Rs." + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				balance -= 800;
				System.out.println(Thread.currentThread().getName() + " your balance after withdraw is Rs." + balance);

			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you have insufficient funds to withdraw , your balance is Rs." + balance);
			}
		}
	}

}

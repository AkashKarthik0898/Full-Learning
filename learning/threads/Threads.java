package com.learning.threads;

import java.util.Arrays;
import java.util.List;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		Thread classThread = new MyThread();
		InterfaceThread interfaceThread = new InterfaceThread();
		List<String> list = Arrays.asList("akash", "aakash", "karthik", "mohan", "jeshwanth", "aaakash", "bharath");
		Thread t = new Thread(() -> System.out.println(list.toString()));
		t.start();
		System.out.println("wait");
		Thread.sleep(3000l); // Wait for 3 seconds(3000 milliseconds)
		System.out.println("wait over");

		classThread.start();
		classThread.run();
//		interfaceThread.start();		//start is a method of class Thread so can't be used here
		interfaceThread.run();

	}

}

class MyThread extends Thread {

	public void run() {
		System.out.println("The thread is created using Thread class");
	}

}

class InterfaceThread implements Runnable {

	@Override
	public void run() {

		System.out.println("The thread is created using Runnable Interface");
	}

}
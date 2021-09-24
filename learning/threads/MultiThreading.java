package com.learning.threads;

class Thread1 extends Thread{

	public void run() {
		for(int i = 0; i<5 ; i++)
		{
			System.out.println(i);
			try {Thread.sleep(1000);}catch (Exception e) {}
		}
		
	}

	
}

class Thread2 extends Thread{
	
	public void run()
	{
		for(int i = 5; i<10 ; i++)
		{
			System.out.println(i);
			try {Thread.sleep(1000);}catch (Exception e) {}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();	//both will work simultaneously
		t2.start();	//this is useful in places where one process is independent of another process to complete

		
		
	}

}

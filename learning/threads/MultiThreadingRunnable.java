package com.learning.threads;

public class MultiThreadingRunnable {

//	class Thread1 implements Runnable {
//
//		public void run() {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//
//		}
//
//	}
//
//	class Thread2 implements Runnable {
//
//		public void run() {
//			for (int i = 5; i < 10; i++) {
//				System.out.println(i);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		}
//	}

	// Since Runnable is a Functional Interface, we can use Lambda Expressions
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Thread1 t1 = new Thread1();
//		Thread2 t2 = new Thread2();
//		Thread thread1 = new Thread(t1);
//		Thread thread2 = new Thread(t2);
		
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 5; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}

package sef.module10.sample;
//Needs to be completed
public class MyThreadClient {
	public static void main(String args[]) {
		
			System.out.println("Thread Name :" + Thread.currentThread().getName());
		
			//1 - Instantiate two objects of MyThread class and pass Thread name as its parameter 
			MyThread mt1 = new MyThread("My_1", 0);
			MyThread mt2 = new MyThread("My_2", 5);
			
		
			//2 - start both the threads using start()
			mt1.start();
			mt2.start();
			
		}
	
}

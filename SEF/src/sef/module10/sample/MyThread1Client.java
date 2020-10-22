package sef.module10.sample;
//Needs to be completed
public class MyThread1Client {
	public static void main(String args[]) {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
			
		//1 - Instantiate an object (say m1) of MyThread1 class 
		MyThread1 m1 = new MyThread1();
		
		//2 - Create 2 objects of Thread class and pass m1 and a thread name as its parameters
		Thread t_1= new Thread(m1, "First");
		Thread t_2= new Thread(m1, "Second");
		
		//3 - Start both the threads using start()

		t_1.start();
		t_2.start();
	}
}
package sef.module10.sample;
//Needs to be completed
public class Sync implements Runnable{
	
	
		  static String msg[]={"This", "is", "a", "synchronized", "variable"};
	
		  public void run(){
		
		  display();
			  
			  }
		  
		 synchronized public void display(){
			//1 - create a for loop which runs from 0-4 
			  for (int i=0; i<=4;i++) {
				  System.out.println(msg[i] + Thread.currentThread().getName());
			  }
			//2 - print the name of the thread along with the array elements
		  
		  try{
		  Thread.sleep(1000);
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		  }
		//3 - Run this method with and without synchronized keyword and
		  //notice the difference in the output
}

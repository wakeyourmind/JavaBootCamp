package sef.module10.sample;
//Completed
public class ThreadPriorityClient {

		  public static void main(String args[]){ 
			  
		  //1 - Create an object of ThreadPriority 
		  ThreadPriority t1 = new ThreadPriority("First thread");
		  //2 - Set a priority (MIN_PRIORITY) for this thread.
		  t1.setPriority(Thread.MIN_PRIORITY);
		  //3 - Start this thread
		  t1.start();
		  
		  //1 - Create an object of ThreadPriority2
		  ThreadPriority2 t2 = new ThreadPriority2("Second thread");
		  //2 - Set a priority (MAX_PRIORITY) for this thread.
		  t2.setPriority(Thread.MAX_PRIORITY);
		  //3 - Start this thread
		  t2.start();
		  }
		
}

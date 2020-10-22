package sef.module10.sample;
//Needs to be completed
public class SyncClient {

		  public static void main(String[] args) {
			  
			  Sync s1=new Sync();
			  
			  Thread d1=new Thread(s1, " ");
			  Thread d2=new Thread(s1, " ");
			  
			  //1 - Create two threads and pass s1 as a parameter.
			  //Also pass a name for these threads
			  d1.start();
			  d2.start();
			  
			  
			  
			  //2 - Start both the threads using start()
			  
		}
		 

}

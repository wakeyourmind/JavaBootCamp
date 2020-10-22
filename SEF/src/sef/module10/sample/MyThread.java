package sef.module10.sample;
//Needs to be completed
//1 - extend from Thread class
class MyThread extends Thread {
	
	int count;
	MyThread(String s, int count) {
		super();
		this.count=count;
	}

	@Override
	public void run() {
		work();
		
	}
	
	public void work()
	{
		
		for (int i = 0; i < count; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}



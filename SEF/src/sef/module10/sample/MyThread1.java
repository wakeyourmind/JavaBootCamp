package sef.module10.sample;
//DONE
class MyThread1 implements Runnable {
	
	public void work()
	 {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void run() {
		work();
		
	}
}



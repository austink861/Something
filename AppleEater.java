class AppleEater implements Runnable{
	private Thread a; 
	private String threadName;
	
	AppleEater(String name){
		threadName = name;
		System.out.println("Creating "+threadName);
	}
	public void run() {
		System.out.println("Running " + threadName);

		int num_eaten = 0;
		while (num_eaten < 4) {
			if(AppleData.apple_pies == 2) {
				AppleData.Eat_ApplePies();
				num_eaten += 2;
			}
		}
		System.out.println("Thread "+ threadName +" exiting.");
	}
	
	public void start() {
		System.out.println("Starting "+ threadName);
		if (a == null) {
			a = new Thread (this, threadName);
			a.start ();
		}
	}
}

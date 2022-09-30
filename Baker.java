class Baker implements Runnable{
	private Thread b;
	private String threadName;
	
	Baker(String name){
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName );
		
		int i = 0;
		while (i<8){
			int r = (int) ((Math.random()*(10-1))+1);
			if(r>5 && AppleData.apple_pies<4) {
				AppleData.Add_ApplePie();
				i++;
			}else if(r<=5 && CherryData.cherry_pies<4){
				CherryData.Add_CherryPie();
				i++;
			}
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if(b == null) {
			b = new Thread (this, threadName);
			b.start ();
		}
	}
}

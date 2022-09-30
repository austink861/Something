public class AppleData {
	static int apple_pies = 0;
	static Object a = new Object();
	
	static void Add_ApplePie() {
		synchronized(a) {
			apple_pies++;
			System.out.println("A new Apple Pie is ready.");
		}
	}
		
	static void Eat_ApplePies() {
		synchronized (a) {
			apple_pies = 0;
			System.out.println("Eating all Apple pies.");
		}
	}
	
}

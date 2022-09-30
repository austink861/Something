public class CherryData {
	static int cherry_pies = 0;
	static Object c = new Object();
	
	static void Add_CherryPie() {
		synchronized(c) {
			cherry_pies++;
			System.out.println("A new Cherry Pie is ready.");
		}
	}
		
	static void Eat_CherryPies() {
		synchronized (c) {
			cherry_pies = 0;
			System.out.println("Eating all Cherry Pies.");
		}
	}
		
}

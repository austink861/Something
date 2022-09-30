public class TestThread {

	public static void main(String[] args) {
		
		
		Baker baker = new Baker("The Baker");
		baker.start();
		
		CherryEater cherry = new CherryEater("Hungry Cherry Lover");
		cherry.start();
		
		AppleEater apple = new AppleEater("Hungry Apple Lover");
		apple.start();
		
	}

}

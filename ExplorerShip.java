
public class ExplorerShip extends SpaceShip{//Extends allows us to use the variables and empty method of SpaceShip.


	public ExplorerShip() {
		numEngines = 2;
		name = "Explorer";
	}
	
	public ExplorerShip(int a) {
		numEngines = a;
		name = "Explorer";
	}
	
	public void ShowSpeed() {
		System.out.println("Vessel name: " +name+"\n"+"Ship Speed = "+(numEngines*2)+" warp factor\n");
	}
	
	
}

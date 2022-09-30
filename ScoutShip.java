
public class ScoutShip extends SpaceShip{//Extends allows us to use the variables and empty method of SpaceShip.

	public ScoutShip() {
		
		numEngines = 1;
		name = "Scout";
	}
	
	public ScoutShip(int a) {
		numEngines = a;
		name = "Scout";
	}
	
	public void ShowSpeed() {
		System.out.println("Vessel name: "+name+"\n"+"Ship Speed = "+(numEngines*2)+" warp factor\n");
	}
	
	
}

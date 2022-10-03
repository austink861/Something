
public abstract class SpaceShip {
	
	protected int numEngines; //Variables are protected so that only child classes can access them.
	protected String name;
	
	abstract void ShowSpeed() {};  //This creates the method to be overwritten by the other classes.

}

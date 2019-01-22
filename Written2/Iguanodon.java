
public class Iguanodon extends Dinosaur {
	public String walk;
	public String roar;
	
	public Iguanodon (boolean c, boolean e, String w, String r) {
		super (c, e);
		this.walk=w;
		this.roar=r;
	}
	
	public String toString() {
		return "Carnivore: " + super.getCarnivore() + "\nExtinct:" + super.getExtinct() + "\nWalks " + this.walk + "\nRoars " + this.roar + "\n"; 			
	}
}

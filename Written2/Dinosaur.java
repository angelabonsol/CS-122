
public abstract class Dinosaur {
	private boolean isCarnivore; 
	private boolean isExtinct; 
	
	public Dinosaur (boolean c, boolean e) {
		this.isCarnivore=c;
		this.isExtinct= e;
	}
	public String getCarnivore() {
		String result=String.valueOf(isCarnivore);
		return result;
	}
	public String getExtinct() {
		String result1=String.valueOf(isExtinct);
		return result1;
	}
	
	public String toString() {
		return "Carnivore:" + this.getCarnivore()+ "\nExtinct: " + this.getExtinct();
	}
}
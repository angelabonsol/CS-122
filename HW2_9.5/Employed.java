
public class Employed extends Person{
	
	private String occupation; 
	
	public Employed ( String name, int age, String nationality, String job) {
		super(name, age, nationality);
		occupation= job;
	}
	
	private String getJob() {
		return occupation;
	}
	
	public String toString () {
		return super.toString() + "\nJob: " + this.getJob();
	}
	
}


public class Janitor extends Employee {

	public Janitor(String Name, int Years, String Position) {
		super(Name, Years, Position);
	}

	public String toString() {
		return super.toString()
				+ "\nJob Description: A person that keeps the hospital clean in order to stop the spread of germs.\n";
	}

}

public class Administrator extends Employee {

	public Administrator(String Name, int Years, String Position) {
		super(Name, Years, Position);
	}

	public String toString() {
		return super.toString()
				+ "\nJob Description: A person that plans and oversees the health services that the hospital provides.\n";
	}
}
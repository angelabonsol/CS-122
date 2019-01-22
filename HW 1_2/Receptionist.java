
public class Receptionist extends Employee {

	public Receptionist(String Name, int Years, String Position) {
		super(Name, Years, Position);
	}

	public String toString() {
		return super.toString()
				+ "\nJob Description: A person who greets the visitors and provide them with first hand information.\n";
	}

}

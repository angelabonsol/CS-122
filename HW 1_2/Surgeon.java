
public class Surgeon extends Doctor {

	public Surgeon(String Name, int Years, String Position, String Type) {

		super(Name, Years, Position, Type);

	}

	public String toString() {
		String result = "Name: " + this.getName() + "\nYears in Service: " + this.getYears() + "\nPosition: "
				+ this.getPosition() + "\nType: " + this.getType()
				+ "\nJob Description: A type of doctor who performs surgery.\n";
		return result;
	}

}
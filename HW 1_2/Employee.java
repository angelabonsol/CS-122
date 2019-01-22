
public class Employee {

	public String name;
	public int years;
	public String position;

	public Employee(String Name, int Years, String Position) {
		name = Name;
		years = Years;
		position = Position;
	}

	public String getName() {
		return name;
	}

	public int getYears() {
		return years;
	}

	public String getPosition() {
		return position;
	}

	public String toString() {
		String result = "Name: " + this.getName() + "\nYears in Service: " + this.getYears() + "\nPosition: "
				+ this.getPosition();
		return result;
	}
}

public class Nurse extends Employee {

	public Nurse(String Name, int Years, String Position) {
		super(Name, Years, Position);
	}

	public String toString() {
		return super.toString()
				+ "\nJob Description: A person that handles the physical exams and health histories of a patient.\n";
	}

}
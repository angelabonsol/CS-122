
public class CollegeStudent extends Student {
	
	protected String collegeMajor;
	private boolean workingStudent;
	
	public CollegeStudent(String name, int age, String nationality, String grade, String major, boolean working) {
		super(name, age, nationality, grade);
		collegeMajor=major;
		workingStudent=working;
	}
	
	protected String getMajor() {
		return collegeMajor;
	}
	
	private boolean getWorking() {
		return workingStudent;
	}
	
	public String toString() {
		return super.toString() + "\nMajor: " + this.getMajor() + "\nWorking Student: " + this.getWorking();
	}

}

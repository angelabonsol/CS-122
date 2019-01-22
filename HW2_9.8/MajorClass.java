
public class MajorClass extends Courses {
	protected int studentLevel;
	private String preRequisites;

	public MajorClass (String title, String number, int credits, String instructor, String des, int level, String prereq) {
		super(title, number, credits, instructor, des);
		studentLevel=level;
		preRequisites=prereq;
	}
	
	protected int getLevel() {
		return studentLevel;
	}
	
	private String getPrereq() {
		return preRequisites;
	}
	
	public String toString() {
		return super.toString() + "\nLevel: " + this.getLevel() + "\nPrerequisite: " + this.getPrereq();
		
	}

}

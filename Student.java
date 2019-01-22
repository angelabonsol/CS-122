
public class Student extends Person{
	String major; 
	public Student (String Name, int Year, String Major) {
		super (Name, Year);
		major=Major;
	}
	public String getMajor() {
		return major;
	}
	public String toString() {
		return super.toString() + ", major=" + this.getMajor();
	}

}

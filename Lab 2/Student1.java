
public class Student1 extends Person1{
	public static String major; 
	
	public Student1(String Name, int Year, String Major) {
		super(Name, Year);
		major=Major;
	}
	public String getMajor() {
		return major;
	}
	
	protected int getAvgAge() {
		return 18;
	}
	
	public String toString() {
		return super.toString() + ", major=" + this.getMajor() + ", avg student age=" + getAvgAge();
	}
	 

}

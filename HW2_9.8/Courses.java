
public class Courses {
	public String courseTitle;
	public String courseNumber;
	protected int amountCredits; 
	public String courseInstructor;
	private String description; 
	
	public Courses(String title, String number, int credits, String instructor, String des ) {
		courseTitle=title; 
		courseNumber=number;
		amountCredits=credits; 
		courseInstructor=instructor; 
		description= des;
	}
	
	public String getTitle() {
		return courseTitle; 
	}
	public String getNumber() {
		return courseNumber;
	}
	protected int getCredits() {
		return amountCredits;
	}
	public String getInstructor() {
		return courseInstructor; 
	}
	private String getDes() {
		return description;
	}
	
	public String toString() {
		String results= "\nCourse Title: " + this.getTitle() + "\nNumber:" + this.getNumber() + "\nCredits: " + this.getCredits() + "\nInstructor: " + this.getInstructor() + "\nCourse Description: " + this.getDes() ; 
		return results;
	}

}

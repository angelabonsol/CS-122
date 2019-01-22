
public class Student extends Person{
	
	public String schoolGrade;
	
	public Student (String name, int age, String nationality, String grade) {
		super (name, age, nationality);
		schoolGrade= grade;	
	}
	
	public String getGrade(){
		return schoolGrade;	
	}
	
	public String toString() {
		
		return super.toString() + "\nLevel of Education: " + this.getGrade() ;
	}

}

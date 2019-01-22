
public class Instructor1 extends Person1 {
	public static float salary; 

	public Instructor1(String Name, int Year, float Salary){
		super(Name, Year);
		salary=Salary;
	}
	public float getSalary() 
	{
		return salary;
	}
	protected int getAvgAge() {
		return 41;
	}
	public String toString() {
		return super.toString()+ ", salary=" + this.getSalary() +", avg instructor age=" + getAvgAge();
	}
	
}

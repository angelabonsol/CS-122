
public class Instructor extends Person {
	public float salary; 

	public Instructor(String Name, int Year, float Salary)
	{
		super(Name, Year);
		salary=Salary;
	}
	public float getSalary() 
	{
		return salary;
	}
	public String toString() {
		return super.toString()+ ", salary=" + this.getSalary();
	}

}

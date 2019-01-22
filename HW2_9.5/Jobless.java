
public class Jobless extends Person{
	
	private String amountIncome; 
	
	public Jobless(String name, int age, String nationality, String income ) {
		super(name, age, nationality);
		amountIncome=income;
	}
	
	private String getIncome() {
		return amountIncome;
	}
	
	public String toString() {
		return super.toString() + "\nAmount of Household Income: " + this.getIncome();
	}

}

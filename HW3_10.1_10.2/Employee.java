public class Employee extends StaffMember implements Payable {
	protected String socialSecurityNumber;
	protected double payRate;
	private int vacationDays;

	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber + this.vacation();
		return result;
	}

	public double pay() {
		return payRate;
	}

	public int vacation() {
		final int days = 14;
		return days;
	}

}

public class Commission extends Hourly {
	protected double totalSales;
	protected double commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = cRate;
	}

	public void setSales(double sales) {
		totalSales = sales;
	}

	public double pay() {
		double payment = super.pay() + (totalSales * commissionRate);
		totalSales = 0;
		return payment;
	}

	public String toString() {
		return super.toString() + "\nCommision pay: " + this.pay();
	}

}

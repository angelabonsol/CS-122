
public class CallingCard extends Card {

	public long callingNumber;
	private int pinNumber;

	public CallingCard(String n, long num, int pin) {
		super(n);
		callingNumber = num;
		pinNumber = pin;
	}

	public long getNum() {
		return callingNumber;
	}

	private int getPin() {
		return pinNumber;
	}

	public String toString() {
		String result = "Calling Card [name=" + this.getName() + "][number= " + this.getNum() + "][Pin=" + this.getPin()
				+ "]";

		return result;
	}

}


public class SimpleCalculator {
	
	private int num1, num2;

	public SimpleCalculator (int number1, int number2) {
		this.num1= number1; 
		this.num2= number2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int number1) {
		this.num1= number1; 
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int number2) {
		this.num2= number2; 
	}
	
	public int add() {
		int added = num1 + num2;
		return added;	
	}
	
	public int subtract() {
		int subtracted = num1 - num2;
		return subtracted;
	}
	public double divide() {
		double divided = num1/num2;
		return divided;
	}
	public int multiply() {
		int multiplied= num1*num2;
		return multiplied;
	}	
	
}


public class DivisorCalc {
	
	public static int gcd(int num1, int num2) {
		while (num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else 
				num2 = num2 - num1;
		return num1;
	}
	
	//Recursive Algorithm 
	// gcd(num1, num2) is num1 if num1 divides into num2 evenly
	// gcd(num1, num2) is gcd(num2, num1 % num2) otherwise

}

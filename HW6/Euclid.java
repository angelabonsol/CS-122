
import java.util.Scanner;

public class Euclid extends DivisorCalc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DivisorCalc test = new DivisorCalc();

		System.out.println("Enter your first integer:");
		int num1 = scan.nextInt();

		System.out.println("Enter your second integer: ");
		int num2 = scan.nextInt();

		int gcd = test.gcd(num1, num2);

		System.out.println("The GCD of " + num1 + " and " + num2 + " : " + gcd);
	}
}

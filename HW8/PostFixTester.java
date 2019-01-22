import java.util.*;

//13.7- Angela Bonsol

public class PostFixTester {
	
	public static void main (String [] args) {
	
		Scanner scan = new Scanner(System.in);
		PostFixExp exp = new PostFixExp();
		
		String expression;
		int result;
		
		System.out.println("Enter your postfix expression: ");
		expression = scan.nextLine();
		
		result = exp.express(expression);
		System.out.println("Equals " + result);
		
	}

}
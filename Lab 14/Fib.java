
public class Fib {
	
	public static int fib(int n) {
		
		System.out.println("Now control is in fib( " + n +" )");
		
		if ( n > 1 )
			return fib(n-1) + fib(n-2);
		else 
			return n;
		
	}	

}

//****************************************************************
//	MathUtils.Java
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException("No Negative Numbers");
		else if (n > 16)
			throw new IllegalArgumentException("No Numbers over 16");
		int fac = 1;
		for (int i = n; i > 0; i--)
			fac *= i;
		return fac;
	}
}

public class CoinTester {
	public static void main(String[] args) {

		final int sum;

		MonetaryCoin coin1 = new MonetaryCoin(5);
		sum = coin1.getValue() + coin1.getValue();

		System.out.println("The value of one monetarycoin is " + coin1.getValue());
		System.out.println("The sum of two monetarycoins is " + sum);
		System.out.println("The result of the flip is " + coin1.toString());
	}
}

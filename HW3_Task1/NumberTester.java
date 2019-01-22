import java.util.Scanner;
public class NumberTester {
	public static void main(String[] args) {
		Integer[] arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like in the array?");
		int n = scan.nextInt();
		arr = new Integer[n];
		
		System.out.println("What are the numbers?");
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = scan.nextInt();
		}
		
		Number missingnumber = new Number();
		missingnumber.Number(arr);
		
		scan.close();
	}
}

import java.util.Scanner;

public class Recursive {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a string that contains 'x' :");
		String word = scan.nextLine();

		System.out.println("You have " + countX(word) + " 'x' characters in your string.");

	}

	public static int countX(String word) {

		int count = 0;

		if (word.length() == 0)
			return 0;

		else if (word.charAt(0) == 'x')
			count++;
		return count + countX(word.substring(1));

	}
}

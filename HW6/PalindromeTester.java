import java.util.Scanner;

public class PalindromeTester {

	public static boolean toTest(String palindrome) {
		if (palindrome.length() == 0 || palindrome.length() == 1)
			return true;
		if (palindrome.charAt(0) == palindrome.charAt(palindrome.length() - 1))
			return toTest(palindrome.substring(1, palindrome.length() - 1));

		return false;
	}

	public static void main(String[] args) {

		String str, another = "y";

		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a potential palindrome: ");
			str = scan.nextLine();

			if (toTest(str))
				System.out.println("That string IS a palindrome.");
			else
				System.out.println("That string is NOT a palindrome.");

			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();
		}
	}
}

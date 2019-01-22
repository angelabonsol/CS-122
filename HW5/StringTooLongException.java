import java.util.Scanner;

public class StringTooLongException extends Exception {

	public static void main(String[] args) throws StringTooLongException {

		Scanner scan = new Scanner(System.in);
		String keepGoing = "yes";

		while (keepGoing.equals("yes")) {

			System.out.println("Please enter your strings (20 characters max.): ");
			String string = scan.nextLine();
			System.out.println("Please enter \"Done\". ");
			String done = scan.nextLine();

			if (done.equalsIgnoreCase("done")) {
				try {
					if (string.length() > 20) {
						throw new StringTooLongException();
					} 
					else {
						System.out.println("Thank you for your message! Enter another one.");
					}
				} 
				
				catch (StringTooLongException stl) {
					System.out.println("You entered more than 20 characters. Try Again.");
				}
			}
		}
	}
}

import java.util.Scanner;

public class InvalidDocumentCodeException extends Exception {
	
	public static void main(String[] args) throws InvalidDocumentCodeException {

		Scanner scan = new Scanner(System.in);
		char firstLetter;
		String keepGoing = "yes";

		while (keepGoing.equals("yes")) {
			
			System.out.println("Enter a document ID: ");
			String id = scan.nextLine();
			firstLetter = id.charAt(0);
			
			try {

				if (firstLetter == 'U') {
					System.out.println("Unclassified File is found.");
				}

				if (firstLetter == 'C') {
					System.out.println("Confidential file is found.");
				}

				if (firstLetter == 'P') {
					System.out.println("Proprietary file is found.");
				}

				else {
					throw new InvalidDocumentCodeException();
				}
			}

			catch (InvalidDocumentCodeException exep) {
				System.out.println("That file does not exist.");
			}
		}
	}
}

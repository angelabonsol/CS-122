import java.util.Scanner;

public class ContactMain {
	public static <T> void main(String[] args) {
		Contact[] contactList;

		contactList = new Contact[5];

		contactList[0] = new Contact("Stella", "Poe", "646-456-6789");
		contactList[1] = new Contact("Marie", "Brown", "347-456-8765");
		contactList[2] = new Contact("Matt", "Johnson", "347-268-9761");
		contactList[3] = new Contact("Rogelio", "De La Vega", "917-345-0931");
		contactList[4] = new Contact("Jane", "Peters", "646-098-1267");

		Sorting.insertionSort(contactList);

		for (int count = 0; count < contactList.length; count++) {
			System.out.println(contactList[count]);
			System.out.println("------------------------------------");
		}

		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter contact details to be searched. ");
		System.out.println("Enter first name: ");
		String firstName = scan.next();
		System.out.println("Enter last name: ");
		String lastName = scan.next();
		System.out.println("Enter phone #:");
		String phone = scan.next();

		Contact target = new Contact(firstName, lastName, phone);

		Contact index = (Contact) Searching.binarySearch(contactList, target);

		if (index != null)
			System.out.println(target + " is on the list.");

		else
			System.out.println(target + " is not in the list.");

	}
}

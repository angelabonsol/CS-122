
//13.5 - Angela Bonsol

import java.util.Random;
import java.util.Scanner;

public class BankTester {
		
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		Random random = new Random();
		final int repeat = 0;
		
		CustomersList queue = new CustomersList();
	
		while (repeat == 0) {
			int option = random.nextInt(2);
		
			if (option == 0 || queue.count() == 0) {
				System.out.println("\nEnter customer name:");
				String name = scan.next();

				queue.enqueue(new Customer(name));
				System.out.println(name + " is on the line for the bank.");
			}

			else {
				Customer customer = queue.dequeue();
				System.out.println( "\n" + customer + " finished at the bank teller.");
			}

			System.out.println("\nThe customers in the queue:");
			System.out.println(queue);
		}
	}

}

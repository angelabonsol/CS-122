
//13.5 - Angela Bonsol

public class CustomersList {

	private CustomerNode line;
	int count;

	public CustomersList() {
		line = null;
		count = 0;
	}

	public void enqueue(Customer customer) {

		CustomerNode node = new CustomerNode(customer);
		CustomerNode current;

		if (line == null) {
			line = node;
		} 
		else {
			current = line;
			while (current.next !=null)
				current = current.next; 
			current.next = node;
			count++;	
		}

	}

	public Customer dequeue() {
		Customer customer;

		if (line != null) {
			customer = line.customer;
			line = line.next;
			count--;
		} 
		else
			customer = null;

		return customer;
	}

	public int count() {
		return count;
	}


	public String toString() {
		String queue = " ";
		CustomerNode current = line;

		while (current != null) {
			queue = queue + current.customer + "\n";
			current = current.next;
		}

		if (queue == " ")
			queue = "No customers";
		return queue;
	}

	private class CustomerNode {
		public Customer customer;
		public CustomerNode next;

		public CustomerNode(Customer cust) {
			customer = cust;
			next = null;
		}
	}

}

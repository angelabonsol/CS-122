//**********************************************************
// TestQueue
// A driver to test the methods of the QueueADT implementations.
//**********************************************************
public class TestQueue
{
	public static void main(String[] args)
	{
		QueueADT q = new LinkedQueue();
		System.out.println("\nEnqueuing chocolate, cake, pie, truffles:");
		q.enqueue("chocolate");
		q.enqueue("cake");
		q.enqueue("pie");
		q.enqueue("truffles");
		System.out.println("\nHere's the queue: " + q);

		// put your code here: print the size of the queue
		System.out.println("Queue size: " + q.size());
	
		System.out.println("\nDequeuing two...");
		
		//put your code here: call the dequeue method twice and print out the dequeued items
		q.dequeue();
		q.dequeue();
		System.out.println(q);
		
		System.out.println("\nEnqueuing cookies, profiteroles, mousse, cheesecake, ice cream:");
		q.enqueue("cookies");
		q.enqueue("profiteroles");
		q.enqueue("mousse");
		q.enqueue("cheesecake");
		q.enqueue("ice cream");
		
		//think about which of the above items cannot be added into the queue? 
		
		System.out.println("\nHere's the queue again: " + q);
		System.out.println("Now it contains " + q.size() + " items.");
		System.out.println("\nDequeuing everything in queue");
		
		//put your code here: dequeue everything in the queue now using a loop
		
		//double check this
		for (int i = 0 ; i < q.size() ; i++ ) {
			q.dequeue();
			i--;
		}
		
		System.out.println("\nNow it contains " + q.size() + " items.");
		
		if (q.isEmpty())
			System.out.println("Queue is empty!");
		else
			System.out.println("Queue is not empty -- why not??!!");
	}
}
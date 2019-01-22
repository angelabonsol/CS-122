//***********************************************************
// LinkedQueue.java
// A linked-list implementation of the classic FIFO queue interface.
//***********************************************************
public class LinkedQueue implements QueueADT
{
	private Node front, back;
	private int numElements = 1;
	//---------------------------------------------
	// Constructor; initializes the front and back pointers
	// and the number of elements.
	//---------------------------------------------
	public LinkedQueue() {
		front = null;
		back = null;
	}
	//---------------------------------------------
	// Puts item on end of queue.
	//---------------------------------------------
	public void enqueue(Object item)
	{
		Node newNode = new Node(item);
		Node temp;
		
		if(front == null)
			front = newNode;
		else {
			temp = front;
			while (temp.next !=null)
				temp = temp.getNext();
			temp.next = newNode;
			numElements++;
		}
	}
	//---------------------------------------------
	// Removes and returns object from front of queue.
	//---------------------------------------------
	public Object dequeue()
	{
		Object obj; 
		 if ( front != null) {
			 obj = front.element;
			 front = front.next; 
			 numElements--;
		 }
		 
		 else 
			 obj = null;
		 
		 return obj;
		
	}
	//---------------------------------------------
	// Returns true if queue is empty.
	//---------------------------------------------
	public boolean isEmpty()
	{
		return (numElements == 0 );
		
	}
	//---------------------------------------------
	// Returns true if queue is full, but it never is.
	//---------------------------------------------
	public boolean isFull()
	{
		return false;
	}
	//---------------------------------------------
	// Returns the number of elements in the queue.
	//---------------------------------------------
	public int size()
	{
		return numElements;
	}
	//---------------------------------------------
	// Returns a string containing the elements of the queue
	// from first to last
	//---------------------------------------------
	public String toString()
	{
		String result = "\n";
		Node temp = front;
		while (temp != null)
		{
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}
}


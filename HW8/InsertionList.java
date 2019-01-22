
//PP 13.4-Angela Bonsol


public class InsertionList {
	
	public InsertionList insert() 
	{
		IntNode head = null;
		IntNode current = head; 
		IntNode tail = null;
		
		while (current != null && tail != head ) 
		{
			IntNode next = current; 
			for(next = current; next.next != tail; next = next.next)
			{ 
				if (next.num <= next.next.num) 
				{
					int temp = next.num; 
					next.num = next.next.num;
						next.next.num = temp;
				}
			}
		tail = next; 
		current = head;
		}
		return this;
	}

}

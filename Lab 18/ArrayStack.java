// ***************************************************************
// ArrayStack.java
//
// An array-based Object stack class with operations push,
// pop, and isEmpty and isFull.
//
// ***************************************************************
public class ArrayStack implements StackADT
{
	private int stackSize = 5; // capacity of stack
	private int top; // index of slot for next element
	private Object[] elements;
	// ---------------------------------------------------
	// Constructor -- initializes top and creates array
	// ---------------------------------------------------
	public ArrayStack()
	{
		top = 0;
	}
	// --------------------------------------------------
	// Adds element to top of stack if it's not full, else
	// does nothing.
	// --------------------------------------------------
	public void push(Object val)
	{
		val = top;
		
		if (isFull() == false) {
			top++;
			val = elements[top];
		}
		else if (isFull() == true){
			return;
		}
	
	}
	// ---------------------------------------------------
	// Removes and returns value at top of stack. If stack
	// is empty returns null.
	// ---------------------------------------------------
	public Object pop()
	{
		Object item = top;

		if (isEmpty() == true) {
			top--;
			item = elements[top];
		}
		return item;

	}
	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty()
	{
		if ( top == 0 ) 
			return true;
		else
			return false;
	}
	// ---------------------------------------------------
	// Returns true if stack is full, false otherwise.
	// ---------------------------------------------------
	public boolean isFull()
	{
		if ( top == 5)
			return true; 
		else 
			return false;
	}
}
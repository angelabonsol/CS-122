//**********************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
//**********************************************************
import java.util.Scanner;
public class Numbers
{
	//---------------------------------------------
	// Reads in an array of integers, sorts them,
	// then prints them in sorted order.
	//---------------------------------------------
	public static void main (String[] args)
	{
		Integer[] intList;
		int size;
		int target;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new Integer[size];
		System.out.println ("\nEnter the numbers...");
		for (int i = 0; i < size; i++)
			intList[i] = scan.nextInt();
		
		System.out.print ("\nInput the integer you want to search: ");
		target = scan.nextInt();
		
		//Your code here
		//Invoke the binary searching algorithm to search for target
	
		 Integer index = (Integer)
	                Searching.binarySearch(intList, target);
	        
	    //Your code here
		//Output the searching result, if found, print the integer; if not found, print out a message
	        
	        if(index != null)
	            System.out.println(target + " is on the list");
	        
	        else
	            System.out.println(target + " is not in the list");
		
	}
}

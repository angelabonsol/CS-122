import java.util.Scanner;

public class Strings
{
	private static Scanner scan;

	public static void main (String[] args)
	{
		String[] StringList;
		
		int size;
		
		scan = new Scanner(System.in);
		
		System.out.print ("\nHow many Strings do you want to sort? ");
		
		size = scan.nextInt();
		
		StringList = new String[size];
		
		System.out.println ("\nEnter the Strings...");
		
		for (int i = 0; i < size; i++)
			
			StringList[i] = scan.next();
		
		Sorting.selectionSort(StringList);
		
		System.out.println ("\nYour Strings in sorted order...");
		
		for (int i = 0; i < size; i++)
			
			System.out.print(StringList[i] + " ");
		
		System.out.println ();
	}
}
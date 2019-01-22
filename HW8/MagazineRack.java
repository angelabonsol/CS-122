
// 13.2 - Angela Bonsol
import java.util.Scanner;

public class MagazineRack
{
    //----------------------------------------------------------------
    //  Creates a MagazineList object, adds several magazines to the
    //  list, then prints it.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {    
        MagazineList rack = new MagazineList();
        Scanner scan = new Scanner(System.in);
        final int repeat =0 ;
        
        rack.add(new Magazine("Time"));
        rack.add(new Magazine("Woodworking Today"));
        rack.add(new Magazine("Communications of the ACM"));
        rack.add(new Magazine("House and Garden"));
        rack.add(new Magazine("GQ"));
        
        System.out.println("Magazine Rack:");
        System.out.println(rack); 
//        rack.delete("House and Garden");
//        System.out.println(); 
//        System.out.println(rack); 

        
        while (repeat == 0) {
        System.out.println("Would you like to add or delete?");
        String choice = scan.nextLine();
        
        		if (choice.equalsIgnoreCase("add")) {
        			System.out.println("Enter the title of the Magazine you want to add:");
        			String title =scan.nextLine();
        			rack.add(new Magazine(title));
        		
        		}
        		else if (choice.equalsIgnoreCase("delete")) {
        			System.out.println("Enter the title of the Magazine you want to delete:");
        			String deleteTitle = scan.nextLine();
        			rack.delete(deleteTitle);
        		}
       
        System.out.println("\nUpdated Magazine Rack:");
        System.out.println(rack);
       
        }
    }
}
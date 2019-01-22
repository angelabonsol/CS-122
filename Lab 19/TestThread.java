import java.util.*;

public class TestThread {
   public static void main(String args[]) {
   
      ThreadDemo T1 = new ThreadDemo( "Thread-1", 1, 10000);
      T1.start();
      
      ThreadDemo T2 = new ThreadDemo( "Thread-2", 10001, 2000);
      T2.start();
      
      Vector<String> str= new Vector<String> (5, 3);
   
      int count=1;
      
      for (int i = 0; i < 10 ; i++) {
    	  	str.addElement("task"+ count++ +"\n");
      }
      
      System.out.println("Size is: "+str.size());
      System.out.println("Default capacity increment is: "+str.capacity());
      
      Enumeration en = str.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }   
}
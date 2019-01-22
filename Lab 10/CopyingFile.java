import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyingFile {

  public static void main(String[] args) {

      String filename = null;
      Scanner fileScanner = null;
      Scanner consoleScanner = new Scanner(System.in);

      do {
          try {
              System.out.print("Enter a file: ");
              filename = consoleScanner.next();
              fileScanner = new Scanner(new File(filename));
          } catch (FileNotFoundException e) {
              System.out.println("File " + filename + " could not be found, "
              		+ "please try again.");
          }

      } while (fileScanner == null);
      
      while (fileScanner.hasNext()) {
          System.out.println(fileScanner.nextLine());
      }

      consoleScanner.close();

  }

}


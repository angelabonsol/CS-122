import java.io.*;
import java.util.Scanner;

public class FileProcessing {

	public static void main(String[] args) {

		String code;
		int count = 1;

		try {

			Scanner source = new Scanner(new FileInputStream("source.txt"));
			PrintWriter destination = new PrintWriter(new FileOutputStream("destination.txt"));

			while (source.hasNextLine()) {
				code = source.nextLine();
				destination.println("Line " + count++ + ": " + code);
				System.out.println("Source has been trasnferred to Destination with line numbers.");
			}
			source.close();
			destination.close();
		}

		catch (FileNotFoundException notFound) {
			System.out.println("Input File is not found");
		} finally {
			System.exit(0);
		}
	}
}
	

import java.io.*;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Warning {

	// @SuppressWarnings({"hiding"})
	public static void main(String[] args) {
		
		String line;
		String name;
		int hours;
		double credits, gpa;

		try {

			Scanner scan = new Scanner(new FileInputStream("Students"));

			PrintWriter outFile = new PrintWriter(new FileOutputStream("Warning"));

			outFile.println("Student on Academic Warning: \n");

			while (scan.hasNextLine()) {
				line = scan.nextLine();
				System.out.println(line);
				StringTokenizer info = new StringTokenizer(line);
				name = info.nextToken();
				hours = Integer.parseInt(info.nextToken());
				credits = Double.parseDouble(info.nextToken());
				gpa = credits / hours;

				if (gpa < 2.0) {
					DecimalFormat df = new DecimalFormat("0.##");
					outFile.println(name + " " + hours + " " + df.format(+gpa));
				}
			}
			scan.close();
			outFile.close();
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("That file was not found.");
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormat error in input file:" + nfe);
		} finally {
			System.out.println("File for Students in Academic Writing has been created.");
			System.exit(0);
		}
	}
}
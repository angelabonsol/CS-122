import java.util.*;

public class SpeakerTester {
	public static void main(String[] args) {

		int speakerNumber, i;
		Speaker a = new Speaker1();
		Speaker b = new Speaker2();
		Speaker c = new Speaker3();

		Scanner scan = new Scanner(System.in);

		System.out.println("The following Speakers talk about the different issues:" + "\n(1)-Sexual Abuse"
				+ "\n(2)-Racism" + "\n(3)-Gay Marriage");
		System.out.println("Please choose an issue (1, 2, or 3)");

		speakerNumber = scan.nextInt();

		if (speakerNumber == 1)
			;
		{
			a.speak();
		}

		if (speakerNumber == 2) {
			b.speak();
		}

		if (speakerNumber == 3) {
			c.speak();
		}

	}
}

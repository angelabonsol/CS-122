import java.util.Random;
import java.util.Scanner;

// ******Driver********** -Angela Bonsol
//Child of Computer Player

public class Driver extends ComputerPlayer {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		int computer;
		int row = 0, column = 0;
		char cross = 'X', nought = 'O';

		System.out.println("\nWelcome to a game of Tic Tac Toe!\n");
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Would you like to play? yes/no ");
		String answer = scan.nextLine();

		while (answer.equalsIgnoreCase("yes")) {
			startGame();

			int player = generator.nextInt(2) + 1;
			if (player == 1) {
				System.out.println(name + ", you are Player 1. You go first.");
				System.out.println("You will be using the character: " + cross);
				player = CROSS;
				computer = NOUGHT;
			}

			else {
				System.out.println(name + ", you are Player 2. Computer goes first. ");
				System.out.println("You will be using the character: " + nought);
				player = NOUGHT;
				computer = CROSS;
			}

			while (currentState == PLAYING) { // repeat until win

				if (player == CROSS) { // if player is the first player

					placePiece(row, column, CROSS); // User makes the first move
					computerMoves(NOUGHT); // computer makes move
				}

				else { // if computer is the first player

					computerMoves(CROSS); // Computer makes first move
					placePiece(row, column, NOUGHT); // user makes move
				}

			} // repeat if not game-over

		}

		System.out.println("See you next time!");

	}
}

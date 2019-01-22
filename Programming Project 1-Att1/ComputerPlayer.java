import java.util.*;

//AI Program - Angela Bonsol
//Child of Board 

public class ComputerPlayer extends Board {
	private static Random generator = new Random();

	public static void computerMoves(char piece) {

		int randomRow;
		int randomColumn;
		randomRow = generator.nextInt(2);
		randomColumn = generator.nextInt(2);
		validMove(randomRow, randomColumn);

		do {
			randomRow = generator.nextInt(2);
			randomColumn = generator.nextInt(2);
			validMove(randomRow, randomColumn);
		} while (validMove(randomRow, randomColumn) == false);

		if (validMove(randomRow, randomColumn) == true) {
			currentRow = randomRow;
			currentColumn = randomColumn;
			System.out.println("Computer will make a move.");
			board[currentRow][currentColumn] = piece;
			displayBoard();
			updateGame(piece, currentRow, currentColumn);
			System.out.println("Your turn!");
		}
	}

}
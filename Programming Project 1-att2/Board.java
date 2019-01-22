import java.util.Scanner;

//Parent Class - Angela Bonsol

public class Board {

	public static final char EMPTY = ' ';
	public static final char CROSS = 'X';
	public static final char NOUGHT = 'O';

	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int X_WON = 2;
	public static final int O_WON = 3;

	public static final int ROWS = 3, COLS = 3;

	public static char[][] board = new char[ROWS][COLS];

	public static int currentState; // game state

	public static int currentPlayer;

	protected static int currentColumn;
	protected static int currentRow;

	public static Scanner scan = new Scanner(System.in);

	public enum GameState {
		PLAYING, DRAW, X_WON, O_WON
	}

	// Displays the board
	public static void displayBoard() {

		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

	}

	// changes char value into an actual string on the board
	public static void printCell(char content) {

		if (content == EMPTY) { // if it continues, break it, back to switch statement
			System.out.println(Character.toString(EMPTY));
		} else if (content == NOUGHT) {
			System.out.println(Character.toString(NOUGHT));
		} else if (content == CROSS) {
			System.out.println(Character.toString(CROSS));
		}
	}

	// Starts the game (sets it up)
	public static void startGame() {
		int row, column;

		for (row = 0; row < ROWS; ++row) {
			for (column = 0; column < COLS; ++column) {
				currentRow = row;
				currentColumn = column;
				board[currentRow][currentColumn] = EMPTY; // makes each space empty
			}
		}
		currentState = PLAYING; // sets current state to playing mode
		currentPlayer = CROSS; // cross player goes first
	}

	// solely for user to place piece on the board
	public static void placePiece(int row, int column, char content) throws ArrayIndexOutOfBoundsException { // player 1
																												// //
																												// computer)
		try {
			System.out.println("Please enter which ROW[1-3]: ");
			row = scan.nextInt() - 1; // array index starts at 0 instead of 1
			System.out.println("Please enter which COLUMN [1-3]: ");
			column = scan.nextInt() - 1;
			validMove(row, column);

			if (validMove(row, column) == false) {
				// if user attempts to put a piece on taken space
				System.out.println("Sorry, that space is taken.");
				placePiece(row, column, content);
			}

			currentRow = row;
			currentColumn = column;
			board[currentRow][currentColumn] = content; // content as in piece
			displayBoard();
			updateGame(content, row, column);

		} catch (ArrayIndexOutOfBoundsException badMove) {
			System.out.println("Invalid Move, Try again.");
		}
	}

	// checks to see if user or computer attempts to put a piece on taken space
	public static boolean validMove(int row, int column) {

		if (board[row][column] == CROSS || board[row][column] == NOUGHT) {
			return false;
		}
		return true;
	}

	// checks if it is time to change state
	public static void updateGame(char current, int currentRow, int currentColumn) {

		win(current, currentRow, currentColumn);
		isDraw();

		if (win(current, currentRow, currentColumn) == true && current == CROSS) { // checks if it is win(double check)
			currentState = X_WON;
			System.out.println("'X' wins! \nThanks for playing!");

		} else if (win(current, currentRow, currentColumn) == true && current == NOUGHT) {
			currentState = O_WON;
			System.out.println("'O' wins! \nThanks for playing!");
		} else if (isDraw() == true) {
			currentState = DRAW;
			System.out.println("Draw! No winner.");
		} else {
			currentState = PLAYING;
		}

	}

	// checks to see if it is a Draw situation
	public static boolean isDraw() {

		for (int row = 0; row < ROWS; ++row) {
			for (int column = 0; column < COLS; ++column) {
				if (board[row][column] == EMPTY) {
					return false; // an empty cell found, not a Draw situation
				}
			}
		}
		return true; // no empty cell, it's a Draw situation
	}

	// checks to see if there is a winning line yet
	public static boolean win(char player, int pRow, int pColumn) {

		if (board[0][0] == player && board[0][1] == player && board[0][2] == player || // 1st row
				board[1][0] == player && board[1][1] == player && board[1][2] == player || // 2nd row
				board[2][0] == player && board[2][1] == player && board[2][2] == player || // 3rd row
				board[0][0] == player && board[1][0] == player && board[2][0] == player || // 1st column
				board[0][1] == player && board[1][1] == player && board[2][1] == player || // 2nd column
				board[0][2] == player && board[1][2] == player && board[2][2] == player || // 3rd column
				board[0][0] == player && board[1][1] == player && board[2][2] == player || // Diagonal (\)
				board[2][0] == player && board[1][1] == player && board[0][2] == player) // Diagonal (/)
			return true;
		else {
			return false;
		}
	}

}

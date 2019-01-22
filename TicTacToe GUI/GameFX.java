import java.awt.Choice;
import java.util.Random;
import java.util.Scanner;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameFX extends Application {
	
	public static Cell [][]cell = new Cell[3][3];
	private static Label status = new Label("Your turn!");
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		
		//StackPane stackBoard = new StackPane();
		
		pane.add(status, 3, 1);
		
		Button reset = new Button ("Reset");
		Button exit = new Button ("Exit");
		Button move = new Button ("Make the Move");
		Button start = new Button("Start the game");
		
		pane.add(reset, 1, 1);
		pane.add(exit, 10, 1);
		pane.add(start, 3, 9);
		pane.add(move, 3, 8);
		
		exit.setOnAction(this::close);
		start.setOnAction(this::newGame);
		move.setOnAction(this::makeMove);
		
		ComboBox<Integer> row = new ComboBox<Integer> ();
		row.getItems().addAll(1, 2, 3);
		ComboBox<Integer> column = new ComboBox<Integer>();
		column.getItems().addAll(1, 2, 3);
		
		pane.add(row, 2, 7 );
		pane.add(column, 4, 7 );
		
		
		Label left = new Label ("Row:");
		Label right = new Label("Column:");
		
		pane.add(left, 2, 6);
		pane.add(right, 4, 6);
		
		Text board = new Text();
		board.setFont(Font.font("Courier New", FontWeight.BOLD, 30));
		
		board.setText("     |    |    \n  ------------\n     |    |    \n  ------------\n     |    |    ");
		
		pane.add(board, 3, 3);
		
		//pane.add(this.displayBoard(), 3, 3);
		
		Scene scene = new Scene (pane, 600, 450, Color.FORESTGREEN);	
		primaryStage.setTitle("Welcome to Tic Tac Toe!");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	public void close(ActionEvent event) {
		System.exit(0);
	}
	
	public void newGame(ActionEvent event) {
		this.displayBoard();
		//^ has to reset
	}
	
	public void makeMove(ActionEvent event) {
		
		//String choice = row.getSelectionModel().getSelectedItem();
		
		//place piece 			
		this.displayBoard();
	}
	
	public static void statePlayer() {
		
		int player = generator.nextInt(2) + 1;
		if (player == 1) {
			status= new Label("You are Player 1. You go first. \nYou will be using the character: X ");
			player = CROSS;
			//computer = NOUGHT;
		}

		else {
			status = new Label("You are Player 2. Computer goes first.\nYou will be using the character: O");
			player = NOUGHT;
			//computer = CROSS;
		}
	}

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
	public static Random generator = new Random();

	public enum GameState {
		PLAYING, DRAW, X_WON, O_WON
	}

	// Displays the board
	/* change system out stuff- make it GUI  
	 */
	public static void displayBoard() {

		Label row1 = new Label(cell[0][0] + " | " + cell[0][1] + " | " + cell[0][2]);
		Label divider1 = new Label("-----------");
		Label row2 = new Label(cell[1][0] + " | " + cell[1][1] + " | " + cell[1][2]);
		Label divider2 = new Label("-----------");
		Label row3 = new Label(cell[2][0] + " | " + cell[2][1] + " | " + cell[2][2]);
		
//		HBox board = new HBox(2);
//		
//		board.getChildren().add(row1);
//		board.getChildren().add(divider1);
//		board.getChildren().add(row2);
//		board.getChildren().add(divider2);
//		board.getChildren().add(row3);
//		
		//return board;

	}

	// changes char value into an actual string on the board
	/* change system out stuff- make it GUI  
	 */
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
		
		statePlayer();
	}

	
	// solely for user to place piece on the board
	public static void placePiece(int row, int column, char content) throws ArrayIndexOutOfBoundsException { // player 1
																												// //																								// computer)
		try {
			//this.row = row;
			//this.column=column;
			validMove(row, column);

			if (validMove(row, column) == false) {
				// if user attempts to put a piece on taken space
				status= new Label("Sorry, that space is taken.");
				placePiece(row, column, content);
			}

			currentRow = row;
			currentColumn = column;
			board[currentRow][currentColumn] = content; // content as in piece
			displayBoard();
			updateGame(content, row, column);

		} catch (ArrayIndexOutOfBoundsException badMove) {
			status= new Label("Invalid Move, Try again.");
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
			status= new Label("'X' wins! \nThanks for playing!");

		} else if (win(current, currentRow, currentColumn) == true && current == NOUGHT) {
			currentState = O_WON;
			status= new Label("'O' wins! \nThanks for playing!");
		} else if (isDraw() == true) {
			currentState = DRAW;
			status= new Label("Draw! No winner.");
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
		
	public static void main (String [] args) {
		launch(args);
	}
	
}

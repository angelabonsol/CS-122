import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*PP 4.14- Angela Bonsol
 * Write a JavaFX application that presents two buttons and a number 
 * (initially 50) to the user. Label the button Increment and Decrement.
 * When the increment button is pushed, increment the displayed value. 
 * Likewise, decrement the value when the decrement button is pushed. 
 */

public class TwoButtons extends Application {

	private int num;
	private Text numText;

	public void start(Stage primaryStage) {

		num = 50;
		numText = new Text("Number: 50");

		Button addButton = new Button("Increase");
		Button subtractButton = new Button("Decrease");

		addButton.setOnAction(this::increaseNum);
		subtractButton.setOnAction(this::decreaseNum);

		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);

		pane.add(addButton, 2, 5);
		pane.add(subtractButton, 4, 5);
		pane.add(numText, 3, 4);

		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Increase or Decrease");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void increaseNum(ActionEvent event) {
		num++;
		numText.setText("Number: " + num);
	}

	public void decreaseNum(ActionEvent event) {
		num--;
		numText.setText("Number: " + num);
	}

	public static void main(String[] args) {
		launch(args);
	}

}

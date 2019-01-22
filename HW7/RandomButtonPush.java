import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.util.Random;

/*PP 4.12-Angela Bonsol
 * Write a JavaFX Application that displays a button and a number. 
 * Every time the button is pushed, change the number to a random 
 * value between 1 and 100. 
 */

public class RandomButtonPush extends Application {

	private int randomNum;
	private Text numText;

	public void start(Stage primaryStage) {

		randomNum = 0;
		numText = new Text("Random num: 0");

		Button button = new Button("Click me!");
		button.setOnAction(this::processButtonPress);

		FlowPane pane = new FlowPane(button, numText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);

		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Random Number");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void processButtonPress(ActionEvent event) {
		Random random = new Random();
		randomNum = random.nextInt(101) + 1;
		numText.setText("Random num: " + randomNum);
	}

	public static void main(String[] args) {
		launch(args);
	}

}

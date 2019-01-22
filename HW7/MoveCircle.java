import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;

/*PP 4.13-Angela Bonsol
 * Write a JavaFX Application that presents a button and a circle.
 * Every time the button is pushed, the circle should be moved to a 
 * new random location within the window. 
 */

public class MoveCircle extends Application {

	Circle circle = new Circle();

	public void start(Stage primaryStage) {

		circle.setRadius(30);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.MAGENTA);

		Button button = new Button("Make it Move!");
		button.setText("Click me!");

		button.setOnAction(this::makeItMove);

		HBox buttonPane = new HBox(button);
		buttonPane.setAlignment(Pos.BOTTOM_CENTER);

		StackPane mainPane = new StackPane(buttonPane, circle);

		Scene scene = new Scene(mainPane, 400, 400);
		primaryStage.setTitle("Moving Circle");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void makeItMove(ActionEvent event) {

		Random random = new Random();
		int horizontal = random.nextInt();
		int vertical = random.nextInt();

		circle.setCenterX(horizontal);
		circle.setCenterY(vertical);

	}

	public static void main(String[] args) {
		launch(args);
	}

}

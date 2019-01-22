import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Name extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		int angle;

		Random generator = new Random();
		angle = generator.nextInt(361);

		primaryStage.setTitle("Name Rotate");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		int x = 100;
		int y = 100;

		Text text = new Text(x, y, "Angela");

		text.setFill(Color.BLACK);
		text.setRotate(angle);
		root.getChildren().add(text);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
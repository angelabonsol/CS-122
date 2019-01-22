
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		int red;
		int green;
		int blue;

		Random generator = new Random();
		red = generator.nextInt(256);
		green = generator.nextInt(256);
		blue = generator.nextInt(256);

		Color random = Color.rgb(red, green, blue);

		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(50);
		rectangle.setWidth(200);
		rectangle.setHeight(150);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(random);

		Group root = new Group();
		root.getChildren().add(rectangle);

		Scene scene = new Scene(root, 400, 250, Color.WHITE);
		primaryStage.setTitle("Random Color Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
	@Override
	public void start(Stage primaryStage) {
		int radius;
		Random generator = new Random();
		radius = generator.nextInt(101) + 50;

		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(radius);
		circle.setStroke(Color.BLUE);
		circle.setFill(Color.YELLOW);

		Pane pane = new Pane();
		pane.getChildren().add(circle);

		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Random Radius Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
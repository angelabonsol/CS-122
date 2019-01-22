import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class House extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Angela's House");
		Group root = new Group();
		Scene scene = new Scene(root, 500, 350, Color.LIGHTSKYBLUE);
		primaryStage.setResizable(false);

		// House Body
		Rectangle body = new Rectangle();
		body.setX(150);
		body.setY(200);
		body.setWidth(190);
		body.setHeight(100);
		body.setStyle("-fx-fill: chocolate");

		// Grass
		Rectangle grass = new Rectangle();
		grass.setX(0);
		grass.setY(300);
		grass.setWidth(600);
		grass.setHeight(50);
		grass.setStyle("-fx-fill: green");

		// Door
		Rectangle door = new Rectangle();
		door.setX(230);
		door.setY(250);
		door.setWidth(30);
		door.setHeight(50);
		door.setStyle("-fx-fill: darkorange");

		// Doorknob
		Circle knob = new Circle();
		knob.setCenterX(250.0f);
		knob.setCenterY(280.0f);
		knob.setRadius(3.0f);
		knob.setStroke(Color.BLACK);
		knob.setStyle("-fx-fill: white");

		// Window Left
		Rectangle windowL = new Rectangle();
		windowL.setX(180);
		windowL.setY(240);
		windowL.setWidth(30);
		windowL.setHeight(30);
		windowL.setStyle("-fx-fill: navajowhite");

		// Window Right
		Rectangle windowR = new Rectangle();
		windowR.setX(280);
		windowR.setY(240);
		windowR.setWidth(30);
		windowR.setHeight(30);
		windowR.setStyle("-fx-fill: navajowhite");

		// Roof
		Polygon roof = new Polygon();
		roof.getPoints().addAll(100.0, 200.0, 240.0, 125.0, 400.0, 200.0);
		roof.setStyle("-fx-fill: red");

		// Chimney
		Rectangle chimney = new Rectangle();
		chimney.setX(300);
		chimney.setY(135);
		chimney.setWidth(25);
		chimney.setHeight(40);
		chimney.setStyle("-fx-fill: brown");

		// Clouds
		Circle cloud1 = new Circle();
		cloud1.setCenterX(50.0f);
		cloud1.setCenterY(50.0f);
		cloud1.setRadius(20.0f);
		cloud1.setStyle("-fx-fill: white");

		Circle cloud2 = new Circle();
		cloud2.setCenterX(75.0f);
		cloud2.setCenterY(50.0f);
		cloud2.setRadius(20.0f);
		cloud2.setStyle("-fx-fill: white");

		Circle cloud3 = new Circle();
		cloud3.setCenterX(200.0f);
		cloud3.setCenterY(50.0f);
		cloud3.setRadius(20.0f);
		cloud3.setStyle("-fx-fill: white");

		Circle cloud4 = new Circle();
		cloud4.setCenterX(225.0f);
		cloud4.setCenterY(50.0f);
		cloud4.setRadius(20.0f);
		cloud4.setStyle("-fx-fill: white");

		Circle cloud5 = new Circle();
		cloud5.setCenterX(110.0f);
		cloud5.setCenterY(100.0f);
		cloud5.setRadius(20.0f);
		cloud5.setStyle("-fx-fill: white");

		Circle cloud6 = new Circle();
		cloud6.setCenterX(140.0f);
		cloud6.setCenterY(100.0f);
		cloud6.setRadius(20.0f);
		cloud6.setStyle("-fx-fill: white");

		Circle cloud7 = new Circle();
		cloud7.setCenterX(170.0f);
		cloud7.setCenterY(100.0f);
		cloud7.setRadius(20.0f);
		cloud7.setStyle("-fx-fill: white");

		// Smoke
		Circle smoke1 = new Circle();
		smoke1.setCenterX(320.0f);
		smoke1.setCenterY(130.0f);
		smoke1.setRadius(8.0f);
		smoke1.setStyle("-fx-fill: lightgrey");

		Circle smoke2 = new Circle();
		smoke2.setCenterX(330.0f);
		smoke2.setCenterY(120.0f);
		smoke2.setRadius(10.0f);
		smoke2.setStyle("-fx-fill: lightgrey");

		Circle smoke3 = new Circle();
		smoke3.setCenterX(345.0f);
		smoke3.setCenterY(105.0f);
		smoke3.setRadius(15.0f);
		smoke3.setStyle("-fx-fill: lightgrey");

		// Sun
		Circle sun = new Circle();
		sun.setCenterX(400.0f);
		sun.setCenterY(50.0f);
		sun.setRadius(30.0f);
		sun.setStyle("-fx-fill: yellow");

		root.getChildren().add(body);
		root.getChildren().add(grass);
		root.getChildren().add(door);
		root.getChildren().add(knob);
		root.getChildren().add(cloud1);
		root.getChildren().add(cloud2);
		root.getChildren().add(cloud3);
		root.getChildren().add(cloud4);
		root.getChildren().add(cloud5);
		root.getChildren().add(cloud6);
		root.getChildren().add(cloud7);
		root.getChildren().add(smoke1);
		root.getChildren().add(smoke2);
		root.getChildren().add(smoke3);
		root.getChildren().add(sun);
		root.getChildren().add(windowL);
		root.getChildren().add(windowR);
		root.getChildren().add(roof);
		root.getChildren().add(chimney);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
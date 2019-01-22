import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/*
 * Write a program that can change the color of ball in a pane. 
 * Add three buttons at the bottom of the pane, which are named 
 * as Red, Green, Blue. Initially, the ball is white with black 
 * boundary. When the “Red” button is clicked, the color of the
 * ball is changed to red; when the “Green” button is clicked,
 * the color of the ball is changed to green; and when the 
 * “blue” button is clicked, the color of the ball is changed
 * to blue. 
 */

public class ChangeColorCircle extends Application {
	private Circle circle = new Circle();
	
	public void start(Stage primaryStage) {
		
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		Button red = new Button("Red");
		Button green = new Button("Green");
		Button blue = new Button("Blue");
		
		red.setOnAction(this::makeItRed);
		green.setOnAction(this::makeItGreen);
		blue.setOnAction(this::makeItBlue);
		
		HBox buttonPane = new HBox(10);
		buttonPane.getChildren().addAll(red, green, blue);
		
		BorderPane pane =  new BorderPane();
		pane.setCenter(circle);
		pane.setBottom(buttonPane);
		
		Scene scene = new Scene (pane, 300, 300);
		primaryStage.setTitle("ChangeColor");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	
	public void makeItRed(ActionEvent event) {	
		circle.setFill(Color.RED);

	}
	
	public void makeItGreen(ActionEvent event) {	
		circle.setFill(Color.GREEN);

	}
	
	public void makeItBlue(ActionEvent event) {
		circle.setFill(Color.BLUE);

	}
	
	public static void main(String[]args) {
		launch(args);
	}

}

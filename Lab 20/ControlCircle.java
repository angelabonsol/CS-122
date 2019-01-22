import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	
	private Circle circle = new Circle();
	
	public void start(Stage primaryStage) {
		
		circle.setRadius(30);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.LAVENDER);
		
		Button eButton = new Button ("Enlarge"); 
		Button sButton = new Button("Shrink");
		
		eButton.setOnAction(this::enlarge);
		sButton.setOnAction(this::shrink);
		
		HBox buttonPane = new HBox(10); //spacing 10
		buttonPane.getChildren().add(eButton);
		buttonPane.getChildren().add(sButton);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(circle);
		pane.setBottom(buttonPane);

		Scene scene = new Scene (pane, 300, 300);
		primaryStage.setTitle("Enlarge or Shrink");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void enlarge(ActionEvent event) {
		
		circle.setRadius(circle.getRadius() + 2);
		
	}
	
	public void shrink(ActionEvent event) {
		
		circle.setRadius(circle.getRadius() - 2);
		
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 
    Pane pane = new Pane(); 
    BorderPane borderPane = new BorderPane();
    
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.centerXProperty().bind(borderPane.widthProperty().divide(2)); 
    circle.centerYProperty().bind(borderPane.heightProperty().divide(2)); 
    circle.setRadius(50);
    circle.setStroke(Color.BLACK); 
    circle.setFill(Color.WHITE);
    
    pane.getChildren().add(circle); // Add circle to the pane
    borderPane.setRight(circle); //sets it to the right, but top right
    BorderPane.setAlignment(circle, Pos.CENTER_RIGHT); //sets circle to center right

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 200, 200);
    primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

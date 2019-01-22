import javax.naming.spi.DirStateFactory.Result;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyleRotateDemo extends Application {
	
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a scene and place a button in the scene
    StackPane pane = new StackPane();
    Button btOK = new Button("OK");
    btOK.setStyle("-fx-border-color: blue; -fx-text-fill: red;");
    pane.getChildren().add(btOK);    
    
    pane.setRotate(-45);
    pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
    
    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  
    btOK.contains(0,0); 
    if (true) 
    		System.out.println("0, 0 in button: YES");
    else
    		System.out.println("0, 0 in button: NO");
    	
    pane.contains(200, 250);
    if (true) 
		System.out.println("200, 250 in button: YES");
    else
		System.out.println("200, 250 in button: NO");
    
    pane.contains(201, 250);
    if (true) 
		System.out.println("201, 250 in button: YES");
    else
		System.out.println("201, 250 in button: NO");
 }
    
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args); 
  }
   
}
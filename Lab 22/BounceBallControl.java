import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class BounceBallControl extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    BallPane ballPane = new BallPane(); // Create a ball pane

    //Your code here: Pause and resume animation when the mouse is pressed and released in the ballPane
   
    ballPane.setOnMousePressed(e -> ballPane.pause());
    ballPane.setOnMouseReleased(e -> ballPane.play());

    //Your code here: Increase and decrease animation speed when UP key and DOWN key is pressed
   
    ballPane.setOnKeyPressed(e -> {

    	if (e.getCode() == KeyCode.UP) {

    	ballPane.increaseSpeed();
    	}

    	else if (e.getCode() == KeyCode.DOWN) {

    	ballPane.decreaseSpeed();
    	}

    	});    

    // Create a scene and place it in the stage
    Scene scene = new Scene(ballPane, 250, 150);
    primaryStage.setTitle("BounceBallControl"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    // Your code here: Must request focus after the primary stage is displayed
    
    ballPane.requestFocus();
    
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
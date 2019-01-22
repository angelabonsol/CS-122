import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class DisplayClock extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the clock components
    Pane pane = new Pane();
    
    //Your code here: create a circle, and it to your pane
    Circle clock = new Circle();
    clock.setCenterX(100);
    clock.setCenterY(100);
    clock.setRadius(75);
    clock.setStroke(Color.BLACK);
    clock.setFill(Color.WHITE);
        
    //Your code here: create 4 texts, representing the four numbers on your clock. 
   
    Text twelve = new Text( 90, 40, "12");
    Text three = new Text( 160, 100, "3");
    Text six= new Text( 95, 170, "6");
    Text nine= new Text( 30, 100, "9");

    //Your code here: create 3 lines, representing the hour, minute and second on your clock. 
   
    Line hour= new Line (100, 100, 70, 98 );
    hour.setStroke(Color.RED);
    
    Line minute= new Line (100, 100, 100, 140);
    minute.setStroke(Color.BLUE);
    
    Line second= new Line (100, 100, 70, 150 );
    second.setStroke(Color.GREEN);

    // 9:30:35
    Text written = new Text( 80, 190, "9:30:35");
    
    // Create a scene and place it in the stage, modify and set the size of the initial scene to 200 by 200
   
    pane.getChildren().add(clock);
    pane.getChildren().add(twelve);
    pane.getChildren().add(three);
    pane.getChildren().add(six);
    pane.getChildren().add(nine);
    pane.getChildren().add(hour);
    pane.getChildren().add(minute);
    pane.getChildren().add(second);
    pane.getChildren().add(written);
    
    Scene scene = new Scene(pane, 200, 200, Color.LIGHTGREY);
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  

  public static void main(String[] args) {
    launch(args);
  }
}
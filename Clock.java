import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Clock extends Application{
	
	private Text date, time;
	Rectangle clock= new Rectangle();
	@Override 
	public void start(Stage primaryStage)
	{
		
		GridPane pane = new GridPane();
		pane.setHgap(3);
		pane.setVgap(3);
		
		clock.setHeight(100);
		clock.setWidth(275);
		clock.setFill(Color.ALICEBLUE);

		date = new Text("May 4, 2018");
		time = new Text("12:40:54");
		
		date.setFont(Font.font("Courier New", FontWeight.BOLD, 35));
		time.setFont(Font.font("Courier New", FontWeight.BOLD, 45));
		
		date.setFill(Color.WHITE);
		time.setFill(Color.BLACK);
		
		digitalTime.setCycleCount(Animation.INDEFINITE);
		digitalTime.play();
		
		digitalDate.setCycleCount(Animation.INDEFINITE);
		digitalDate.play();
	
		pane.add(clock, 2, 2);
		pane.add(date, 1, 2);
		pane.add(time, 2, 2 );
		
		Scene scene = new Scene(pane, 530, 110, Color.GREY);
		primaryStage.setTitle("Digital Clock");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	final Timeline digitalTime = new Timeline(
			new KeyFrame(Duration.seconds(0), 
				new EventHandler<ActionEvent>() {
					@Override public void handle(ActionEvent actionEvent) {
		Calendar getTime = Calendar.getInstance();
		getTime.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		int hour = getTime.get(Calendar.HOUR);
		int min = getTime.get(Calendar.MINUTE);
		int sec= getTime.get(Calendar.SECOND);
		
		time.setText(hour + ":" + min + ":" + sec + " " + new SimpleDateFormat("a").format(getTime.getTime()));
		
		}
	  }
	),
	new KeyFrame(Duration.seconds(1))
	);
	

	final Timeline digitalDate = new Timeline (
			new KeyFrame(Duration.seconds(0), 
					new EventHandler<ActionEvent>() {
						@Override public void handle(ActionEvent actionEvent) {

		Calendar getDate = Calendar.getInstance();

		int day = getDate.get(Calendar.DAY_OF_MONTH);
		int year = getDate.get(Calendar.YEAR);
		
		date.setText( new SimpleDateFormat ("MMM").format(getDate.getTime()) + " " + day + ", " + year);
		}
	   }
     ),
     new KeyFrame(Duration.seconds(1))
	 );
	
	public static void main(String [] args) {
		launch(args);
	}
}

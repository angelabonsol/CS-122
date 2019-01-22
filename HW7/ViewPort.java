
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*PP 4.11-Angela Bonsol 
 * Write a JavaFX application that displays an image 
 * next to another version of that image using a viewport 
 * to restrict the visual area displayed in some 
 * appropriate way. 
 */

public class ViewPort extends Application {

	public void start(Stage primaryStage) {

		Image central = new Image("https://assets.dnainfo.com/generated/photo/2015/10/peace-sign-1444163737.jpg/larger.jpg");
		ImageView view = new ImageView(central);
		ImageView viewPort = new ImageView(central);

		viewPort.setViewport(new Rectangle2D(200, 80, 200, 500));

		BorderPane pane = new BorderPane();
		pane.setLeft(view);
		pane.setRight(viewPort);
		pane.setStyle("-fx-background-color: palegreen");

		Scene scene = new Scene(pane, 600, 300);

		primaryStage.setTitle("Central Park");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}

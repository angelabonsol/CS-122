import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CalcFX extends Application{
	
	private static TextField num1 = new TextField();
	private static TextField num2 = new TextField();
	
	private static Button btAdd= new Button("Add");
	private static Button btSub= new Button("Subtract");
	private static Button btDiv= new Button("Divide");
	private static Button btMul= new Button("Multiply");
	private static Text addText = new Text("Sum: 0");
	private static Text subText = new Text("Difference: 0");
	private static Text divText = new Text("Dividend: 0");
	private static Text mulText = new Text("Product: 0");
	private static int sum= 0;
	private static int difference= 0;
	private static double dividend= 0;
	private static int product= 0;
	
	public void start (Stage primaryStage) {
		
		GridPane gridPane = new GridPane();
		 gridPane.setAlignment(Pos.CENTER);
		 gridPane.setHgap(10);
		 gridPane.setVgap(10);
		
		 display(gridPane);
		 
		 btAdd.setOnAction(this::addButton);
		 btSub.setOnAction(this::subButton);
		 btDiv.setOnAction(this::divButton);
		 btMul.setOnAction(this::mulButton);
		  	
		 Scene scene = new Scene(gridPane, 800, 300);
		    primaryStage.setTitle("SimpleCalculator"); // Set title
		    primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show(); // Display the stage
		    primaryStage.resizableProperty().setValue(false); 
	}
	
	public static void display(GridPane grid) {
		Label enter = new Label ("Enter two numbers:");
		grid.add(enter, 0, 1);
		
		num1 = new TextField();
		grid.add(num1, 2, 1);
		
		num2= new TextField();
		grid.add(num2, 3, 1);
		
		btAdd= new Button("Add");
		btSub= new Button("Subtract");
		btDiv= new Button("Divide");
		btMul= new Button("Multiply");
		grid.add(btAdd, 0, 2);
		grid.add(btSub, 1, 2);
		grid.add(btDiv, 2, 2);
		grid.add(btMul, 3, 2);
		
		grid.add(addText, 0, 3);
		grid.add(subText, 1, 3);
		grid.add(divText, 2, 3);
		grid.add(mulText, 3, 3);

	}
		
	private void calculate() {
		
		int the1 = Integer.parseInt(num1.getText());
		int the2 = Integer.parseInt(num2.getText());
				
		SimpleCalculator calc = new SimpleCalculator(the1, the2);	
		
		sum = calc.add();
		difference = calc.subtract();
		dividend = calc.divide();
		product = calc.multiply();
			
	}
		
	 public void addButton(ActionEvent e) {
		calculate();
		addText.setText("Sum:" + sum);
	 }
	 
	 public void subButton(ActionEvent e) {
		 calculate();
		 subText.setText("Difference:" + difference);
	 }
	 
	 public void divButton(ActionEvent e) {
		 calculate();
		 divText.setText("Dividend:" + dividend);
	 }
	 
	 public void mulButton(ActionEvent e) {
		 calculate();
		 mulText.setText("Product:" + product);
	 }

	
	 public static void main(String[] args) {
		    launch(args);
		  }
}

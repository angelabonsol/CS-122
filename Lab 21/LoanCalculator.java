import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
  private static TextField tfAnnualInterestRate = new TextField();
  private static TextField tfNumberOfYears = new TextField();
  private static TextField tfLoanAmount = new TextField();
  private static TextField tfMonthlyPayment = new TextField();
  private static TextField tfTotalPayment = new TextField();
  private static Button btCalculate = new Button("Calculate");
 
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  // Create UI
	  // Set properties for UI3
	  // Process events, set up handler
	 GridPane gridPane = new GridPane();
	 gridPane.setAlignment(Pos.CENTER);
	 gridPane.setHgap(10);
	 gridPane.setVgap(10);
	 
	  addComponents(gridPane);
    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 500, 300);
    primaryStage.setTitle("LoanCalculator"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    primaryStage.resizableProperty().setValue(false);
	 
	 btCalculate.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle (ActionEvent e) {
			 if (tfAnnualInterestRate.getText().equals(""))
				 displayDialog("Please enter the Annual Interest Rate");
			 else if (tfNumberOfYears.getText().equals(""))
				 displayDialog("Please enter the number of years");
			 else if (tfLoanAmount.getText().equals(""))
				 displayDialog("Please enter the Loan Amount");
			 else {
				 calculateLoanPayment();
			 }
		 }
	});
  }
  
  public static void displayDialog(String message)
	{
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText("Empty Field");
		alert.setContentText(message);
		alert.showAndWait();
	}
  
  public static void addComponents(GridPane grid)
	{
	  	Label in = new Label ("Input:");
	  	grid.add(in, 0, 1);
		Label Irate = new Label("Annual Interest Rate: ");
		grid.add(Irate, 0, 2);
		tfAnnualInterestRate = new TextField();
		grid.add(tfAnnualInterestRate, 1, 2);
		Label Nyears = new Label("Number of Years: ");
		grid.add(Nyears, 0, 3);
		tfNumberOfYears = new TextField();
		grid.add(tfNumberOfYears, 1, 3);
		Label Lamount = new Label("Loan Amount: ");
		grid.add(Lamount, 0, 4);
		tfLoanAmount = new TextField();
		grid.add(tfLoanAmount, 1, 4);
		
		btCalculate = new Button("Calculate");
		HBox calc_btn = new HBox(10);
		calc_btn.setAlignment(Pos.CENTER_RIGHT); //bottom Right
		calc_btn.getChildren().add(btCalculate);
		grid.add(calc_btn, 1, 5);
		
		Label out = new Label ("Output:");
	  	grid.add(out, 0, 6);
		Label Mpayment = new Label("Monthly Payment: ");
		grid.add(Mpayment, 0, 7);
		tfMonthlyPayment = new TextField();
		grid.add(tfMonthlyPayment, 1, 7);
		Label Tpayment = new Label("Total Payment: ");
		grid.add(Tpayment, 0, 8);
		tfTotalPayment = new TextField();
		grid.add(tfTotalPayment, 1, 8);
		
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
	}
  
  private void calculateLoanPayment() {
    // Get values from text fields
    double interest = Double.parseDouble(tfAnnualInterestRate.getText());
    int year = Integer.parseInt(tfNumberOfYears.getText());
    double loanAmount = Double.parseDouble(tfLoanAmount.getText());

    // Create a loan object. Loan defined in Listing 10.2
    Loan loan = new Loan(interest, year, loanAmount);

    // Display monthly payment and total payment
    tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
    tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));  
	  
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

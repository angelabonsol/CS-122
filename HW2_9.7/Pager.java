
public class Pager extends Electronics {
	protected String messageSlots;
	
	public Pager( String type, String name, String brand, String price, String weight, String messages ) {
		super ( type, name, brand, price, weight);
		messageSlots=messages;
	}

	protected String getMessages() {
		return messageSlots;
	}
	
	public String toString() {
		return super.toString() + "\nMessage slots storage: " + this.getMessages() ;
	}
	
}


public class Computer extends Electronics {
	protected String coreProcessor;
	public String productDisplay;
	
	public Computer (String type, String name,  String brand, String price, String weight, String processor, String display) {
		super( type, name, brand, price, weight);
		coreProcessor= processor;
		productDisplay=display;
	}
	
	protected String getProcessor(){
		return coreProcessor;
	}
	public String getDisplay() {
		return productDisplay;
	}
	
	public String toString() {
		return super.toString() + "\nProcessor: " + this.getProcessor() + "\nDisplay: " + this.getDisplay() ;
	}

}


public class Cellphone extends Electronics {
	protected String powerUsage;
	private String productStorage; 
	
	public Cellphone ( String type, String name, String brand, String price, String weight, String power, String storage ) {
		super(type, name, brand, price, weight); 
		powerUsage=power;
		productStorage=storage;	
	}
	
	protected String getPower(){
		return powerUsage;
	}
	
	private String getStorage() {
		return productStorage;
	}
	
	public String toString() {
		return super.toString() + "\nPower Usage: " + this.getPower() + "\nStorage: " + this.getStorage() ;
		
	}
	
	
}


public class Electronics {
	public String productName;
	public String productType;
	private String productBrand; 
	private String priceRange;
	public String productWeight;
	
	public Electronics(String type, String name,  String brand, String price, String weight) {
		productType=type;
		productName=name;
		productBrand=brand;
		priceRange=price;
		productWeight=weight;
	}

	public String getType(){
		return productType;
	}
	
	public String getName() {
		return productName;
	}
	
	private String getBrand() {
		return productBrand;
	}
	
	private String getPrice() {
		return priceRange;
	}
	
	public String getWeight() {
		return productWeight;
	}
	
	public String toString () {
		String result= "\n" + this.getType() + "\nProduct Name: " + this.getName() + "\nBrand: " + this.getBrand() + "\nPrice: " + this.getPrice() + "\nWeight: " + this.getWeight();
		return result;
	}

}


public class DigitalCamera extends Electronics {
	private double megaPixel;
	
	public DigitalCamera( String type, String name, String brand, String price, String weight, double pixel) {
		super(type, name, brand, price, weight);
		megaPixel=pixel;
	}
	
	private double getPixel() {
		return megaPixel;
	}
	
	public String toString () {
		return super.toString() + "\nResolution: " + this.getPixel() + " megapixels" ;
	}
	
}
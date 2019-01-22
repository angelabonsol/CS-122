
public abstract class Shape {
	
	public String shapeColor;
	protected double area;
	
	public Shape (String color) {
		shapeColor=color;
	}
	
	public String getColor() {
		return shapeColor;
	}
	
	/*
	public String toString() {
		String result = "Color:" + this.getColor() ;
		return result;
	}
	*/
	
	public double computeArea() {
		return area;
	}

}

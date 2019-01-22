
public class Rectangle extends Shape {
	
	protected double length;
	protected double width;
	
	public Rectangle (String color, double len, double wid) {
		super (color);
		length= len;
		width = wid;
	}
	
	public String toString() {
		String result= "Rectangle Color:" + this.getColor();
		return result;
	}
	
	public double computeArea() {
		area= length*width;
		return area;
	}

}

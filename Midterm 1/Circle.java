
public class Circle extends Shape implements Comparable {
	
	protected Double radius;
	private double pi = 3.14;
		
	public Circle (String color, double rad) {
		super (color);
		radius = rad;
	}
	
	protected double getRad() {
		return radius;
	}
	
	public String toString() {
		String result = "Circle Color:" + this.getColor();
		return result;
	}
	
	public double computeArea() {
		area= pi*radius*radius;
		return area;
	}

	@Override
	public int compareTo(Object sort) {
		int result; 
		double sortRad= ((Circle)sort).getRad();
		result = radius.compareTo(sortRad);
		return result;
	}
	
}


public class ShapeTester {

	public static void main(String[] args) {
		
		Circle c = new Circle("yellow", 2.5);
		Rectangle r = new Rectangle("blue", 3.0, 5.0);
		System.out.println(c);
		System.out.println("Area is "+ c.computeArea());
		System.out.println(r);
		System.out.println("Area is "+ r.computeArea());		
		
		System.out.println("\n---Task # 2---\n");
		
		Shape [] shapeList;
		shapeList = new Shape [5];
		
		shapeList[0]= new Circle("yellow", 2.5);
		shapeList[1]= new Rectangle("blue", 3.0, 5.0);
		shapeList[2]= new Circle("red", 5.0);
		shapeList[3]= new Circle("green", 1.0);
		shapeList[4]= new Rectangle("black", 10.0, 2.0);
		
		for (int i=0; i< shapeList.length; i++) {
			System.out.println(shapeList[i]);
			System.out.println("Area is "+ ((shapeList[i]).computeArea()));
		}
		
		System.out.println("\n");
		
		Circle [] circleList;
		circleList = new Circle [3];
		
		circleList[0]= new Circle("yellow", 2.5);
		circleList[1]= new Circle("red", 5.0);
		circleList[2]= new Circle("green", 1.0);
		
		Sorting.insertionSort(circleList);
		
		for (int i = 0; i < circleList.length; i++) {
			System.out.println(circleList[i]);
		}
		
	}

}
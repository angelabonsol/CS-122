public class ArrayTester extends Array {
	public static void main(String[] args) {
		Integer arr[] = new Integer [] {45 ,46 ,47 ,48 ,49 ,50 ,51 ,52 };
		
		int k = 3;
		kSmallest(arr,k);
		
		System.out.println("The smallest elements are: " + k);
	}
}


public class Number {

	public void Number(Integer[]arr) {
		Sort.selectionSort(arr);
		for (int i = 0;i < (arr.length - 1); i++) {
			int next= arr[i +1];
			int current = arr[i];
			if((next-current) > 1) {
				System.out.println("Missing Value is: " + (current + 1));
			}
		}
	}
}
	
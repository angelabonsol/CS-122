
import java.util.Arrays;
import java.util.Collections;

public class Array {
	
	public static void kSmallest(Integer [] arr, int k) {
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < k; i++)
			System.out.println(arr[i] + " ");
	
	}
	
}

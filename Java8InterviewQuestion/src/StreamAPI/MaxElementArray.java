package StreamAPI;

import java.util.Arrays;

public class MaxElementArray {
	public static void main(String[] args) {
		
	
	int arr[]= {12,56,78,98,45};
	System.out.println(findMaxElement(arr));

}

	private static int findMaxElement(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
		
	}
}
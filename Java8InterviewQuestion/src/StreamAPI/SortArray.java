package StreamAPI;

import java.util.Arrays;

public class SortArray {
	public static void main(String args[]) {
		int arr[]= {2,4,5,6,8};
		
		Arrays.parallelSort(arr);
		//Sorted the array using parallel sort
		
		Arrays.stream(arr).forEach(System.out::println);
		
		
	}

}

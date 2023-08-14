package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	public static void main(String []args) {
		List<Integer> myList=Arrays.asList(12,35,48,58,47);
		
		myList.stream().findFirst().ifPresent(System.out::println);
		
	
	}

}

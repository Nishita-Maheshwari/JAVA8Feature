package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SortedValues {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,8,2,38,4,6,3);
		
		list.stream().sorted().forEach(System.out::println);
		
		
	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,3,6,8,9,4,5);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}

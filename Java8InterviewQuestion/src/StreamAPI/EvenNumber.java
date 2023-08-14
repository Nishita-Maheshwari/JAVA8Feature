package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(12,3,4,5,6,7,8);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
				
			
		
	}

}


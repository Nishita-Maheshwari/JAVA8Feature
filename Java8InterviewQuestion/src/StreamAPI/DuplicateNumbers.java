package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {
	public static void main(String []args) {
		
		List<Integer> list=Arrays.asList(112,48,112,48,78,36,75);
		
		Set <Integer> set= new HashSet();
		
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);
		
		
	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(12,58,59,59,58,12);
		Set<Integer> set=new HashSet();
		
		mylist.stream().filter(s->set.add(s)).forEach(System.out::println);
		
	}

}

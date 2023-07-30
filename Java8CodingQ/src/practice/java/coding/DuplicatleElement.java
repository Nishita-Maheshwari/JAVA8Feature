package practice.java.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatleElement {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,10,20,30,45,60);
		Set<Integer> set=new HashSet<>();
		
		list.stream().filter(x->set.add(x)).forEach(x->System.out.println(x));
		
	}

}

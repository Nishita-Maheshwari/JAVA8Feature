package JavHungryJava8InterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,45,14,14);
		
		Set<Integer> set=new HashSet();
		
		list.stream().filter(s->!set.add(s)).forEach(System.out::println);
		
		
		

	}

}

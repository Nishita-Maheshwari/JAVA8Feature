package StreamAPI;

import java.util.Arrays;
import java.util.List;


public class NumberStartingWith1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,57,14,16,180);
		
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		
		//map(s->s+"")     convert integer to string

	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class OddNumber {

	public static void main(String[] args){
		List<Integer> list=Arrays.asList(2,23,48,7,78,98);
		
		list.stream().filter(n->n%2 !=0).forEach(System.out::println);

	}

}

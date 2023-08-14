package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CubeList {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,4,5);
		
		list.stream().map(i->i*i*i).forEach(System.out::println);
		
	}

}

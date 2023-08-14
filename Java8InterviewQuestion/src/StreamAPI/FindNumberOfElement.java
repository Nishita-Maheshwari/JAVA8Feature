package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindNumberOfElement {
	public static void main(String []args) {
		List<Integer> list=Arrays.asList(0,1,2,3,4,5);
		
		long count=list.stream().count();
		
		System.out.println(count);
	}

}

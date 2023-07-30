package practice.java.coding;

import java.util.Arrays;
import java.util.List;

public class LimitFunction {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,5,6,7,8,66,777,54,22,66);
		
		list.stream().limit(7).forEach(x->System.out.println(x));
		

	}

}

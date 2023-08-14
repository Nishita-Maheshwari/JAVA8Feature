package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMinValue {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(112,25,36,8,0,5,9);
		
		int min=list.stream().min(Integer:: compare).get();
		
		System.out.println(min);
	}

}

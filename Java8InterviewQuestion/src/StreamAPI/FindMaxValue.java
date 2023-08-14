package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,36,95,74,69);
		
		int max=list.stream().max(Integer:: compare).get();
		
		System.out.println(max);
		
	}

}

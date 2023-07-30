package practice.java.coding;

import java.util.Arrays;
import java.util.List;

public class SkipFunction {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,5,6,7,99,77,234,56,78,90,667);
		
		list.stream().skip(7).forEach(x->System.out.println(x));

	}

}

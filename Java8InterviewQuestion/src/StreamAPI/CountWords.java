package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountWords {
	
    public static void main(String args[]) {
	
	List<String> names=Arrays.asList("AA","AA","BB","CC","AA");
	
	Map<String, Long> nameCount= names.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(nameCount);
	
	
    }

}

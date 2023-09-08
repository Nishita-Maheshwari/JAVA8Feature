package JavHungryJava8InterviewQ;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
	public static void main(String[] args) {
		String input="This Code by Nishita Maheshwari";
		
		Character Result= input.chars()
				 .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() == 1L)
                 .map(entry -> entry.getKey())
                 .findFirst()
                 .get();
		
		System.out.println(Result);
	}

}

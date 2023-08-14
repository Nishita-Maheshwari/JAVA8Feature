package StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCountOfCharacter {

	public static void main(String[] args) {
		String s="here is there where is you";
		findCountOfChars(s);

	}

	private static void findCountOfChars(String s) {
		Map<String,Long> map=Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(str->str,
						LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(map);
		

}
}
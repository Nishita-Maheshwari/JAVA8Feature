package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("NIKK","AAs","nis","abc");
		
		//List<String> ls=str.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		//System.out.println(ls);
		
		str.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);;

	}

}

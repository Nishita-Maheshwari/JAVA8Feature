package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("aa","ss","nikk");
        List<String> nameLst = names.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        System.out.println(nameLst);
    }

}

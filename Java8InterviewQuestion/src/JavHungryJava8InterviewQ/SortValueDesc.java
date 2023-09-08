package JavHungryJava8InterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortValueDesc {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,45,14,14);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

}
}
package JavHungryJava8InterviewQ;

import java.util.Arrays;

import java.util.List;

public class SortValue {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,45,14,14);
		
		list.stream().sorted().forEach(System.out::println);

}
}
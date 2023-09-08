package JavHungryJava8InterviewQ;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,45,14,14);
		int max=list.stream().max(Integer::compare).get();
				System.out.println(max);

}
}
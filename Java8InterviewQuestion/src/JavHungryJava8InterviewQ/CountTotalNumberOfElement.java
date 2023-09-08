package JavHungryJava8InterviewQ;

import java.util.Arrays;
import java.util.List;

public class CountTotalNumberOfElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,45,14,14);
		
		long count=list.stream().count();
		System.out.println(count);

}
}
package JavHungryJava8InterviewQ;

import java.util.Arrays;
import java.util.List;

public class StartWith1 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(12,23,12,14,15,19);
		
		lst.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
	}

}

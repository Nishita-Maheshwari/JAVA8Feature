package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CubeListGt50 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,8,9,7);
		
		list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
		
	}

}

package practice.java.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryLessthan3rdHigh {
	public static void main(String[] args) {
		List <Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,500));
		empList.add(new Employee(1,2000));
		empList.add(new Employee(1,5100));
		empList.add(new Employee(1,22000));
		empList.add(new Employee(1,5030));
		empList.add(new Employee(1,20030));
		
		List<Employee> empSortedList=empList.stream().sorted((o1,o2)-> (int)(o2.getSalary()-o1.getSalary()))
				.skip(3)
				.collect(Collectors.toList());
		System.out.println(empSortedList);
	}
	

}

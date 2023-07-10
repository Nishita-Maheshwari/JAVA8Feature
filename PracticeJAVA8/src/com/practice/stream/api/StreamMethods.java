package com.practice.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		
		//filter(predicate)	
		//boolean value function e->e>10
		
		List<String> names=List.of("Aman","dfy","Ankit","Abhinav","Durgesh");
		List<String> newNames= names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
		
		
		//square
		List<Integer> numbers=List.of(23,2,4,5,68);
		List<Integer> newNum=numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNum);
		
		
		
		
		names.stream().forEach(System.out::println);
		
		//sorted
		numbers.stream().sorted().forEach(System.out::println);
		
		
		
		//min max
		
		Integer integer=numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min"+integer);
	}

}

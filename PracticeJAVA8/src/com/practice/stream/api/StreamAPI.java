package com.practice.stream.api;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//Create a list and filter all even numbers from list
		
		List<Integer> list1=List.of(2,3,4,56,899);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(9);
		list2.add(5);
		list2.add(4);
		
		List<Integer> list3=Arrays.asList(23,567,12,677,24);
		
		
		//filter list without stream
		List<Integer> listEven=new ArrayList<>();
		
		for(Integer i: list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
		
		
		
		
		
		//usingstream
		Stream<Integer> stream=list1.stream();
	List<Integer> newList=	stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		
		//usingStream+Lambda
		
		List<Integer> newList1=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList1);
		
		
		
		// find those number who are greater than 50
	List<Integer> greaterList=	list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(greaterList);
		
	}

}

package com.practice.functionalInterface;

public interface FunctionalInterfaceDemo {
	
	void singleAbstractMethod();
	
	default void printName() {
		System.out.println("welcome to the code");
	}
	
	
	default void printName2() {
		System.out.println("welcome to the code2 ");
		
	}

}

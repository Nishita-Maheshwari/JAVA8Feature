package com.practice.methodReference;

//Method Reference are special type of lambda expression

public class MethodReference {
	public static void main(String[] args) {
		System.out.println("learning method refernce...");
		
		//provide the implementation of workInter
		
		
		//static method ko refer kiya hai
		//ClassName:methodName
		
		WorkInter workInter =Stuff::doStuff;		
		workInter.dTask();
		
		Runnable runnable =Stuff::threadTask;
		Thread d=new Thread(runnable);
		d.start();
		
		
		
		
		
		//referring non static object
		
		Stuff ob =new Stuff();
		Runnable runnable1 =ob::printNumber;
		Thread d1=new Thread(runnable1);
		d1.start();
		
	}
	

}

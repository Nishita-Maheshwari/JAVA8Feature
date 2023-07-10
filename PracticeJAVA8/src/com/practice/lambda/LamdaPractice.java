package com.practice.lambda;

import java.util.concurrent.Callable;

public class LamdaPractice {

	public static void main(String[] args) {
		System.out.println("My system start...");
		
//		MyInter myInter =new MyInterImpl();
//		myInter.sayhello();
		

		
		
//anonymous class for implementing interface
		
//		MyInter i=new MyInter() {
//
//			@Override
//			public void sayhello() {
//				// TODO Auto-generated method stub
//				System.out.println("this is first anonymous class");												
//			}						
//		};
//		i.sayhello();
//		
//		
//		MyInter i2=new MyInter() {
//
//			@Override
//			public void sayhello() {
//				// TODO Auto-generated method stub
//				System.out.println("this is first anonymous class");												
//			}						
//		};
//		i2.sayhello();
		
		

		
		
		//using our interface with the help of lambda
		
		MyInter i=()->{System.out.println("this is first using lambda");};
		
		i.sayhello();
		
		MyInter i2=()->{System.out.println("second lambda");};
		i2.sayhello();
		
		
		
		
		
		
		//Sum intern
		
		SumInter sumInter=(a,b)->a+b;
		
		System.out.println(sumInter.Sum(4, 5));


		//LengthInter
		LengthInter lengthInter=str->str.length();
		System.out.println("Length of String is " +lengthInter.getLength("nikkkk gghjghjh"));

	}

}

package com.practice.optionalClass;

import java.util.Optional;

//to avoid null pointer exception

public class OptionalExample {
	
	public static Optional<String> getName(){
			String name="nishta";
			return Optional.ofNullable(name);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String str="Java is my favourite";
		
		Optional<String> optional=Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		
	//	System.out.println(optional.get());
		
		System.out.println(optional.orElse("No value is this objet"));
	    
        
		
		Optional<String> nameOptional=getName();
		System.out.println(nameOptional.orElse("null return"));
		
	}

}

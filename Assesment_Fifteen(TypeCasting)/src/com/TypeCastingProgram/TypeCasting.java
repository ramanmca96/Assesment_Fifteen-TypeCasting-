package com.TypeCastingProgram;

public class TypeCasting {

public static void main(String[] args) {
	    
	    System.out.println("Convert String to Integer");
	    String str = "11";
	    Integer s1=Integer.parseInt(str); 
		System.out.println(s1);  
		
		System.out.println("String to Int Object" );
		Integer s2=Integer.valueOf(str);  
		System.out.println(s2);    
		
		 System.out.println("Convert Integer to String");
		    int i = 500;
		    String i1=Integer.toString(i); 
			System.out.println(i1);  
			
			String i2=String.valueOf(i);   
			System.out.println(i2);    
}
}

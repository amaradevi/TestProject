package com.oracle.test1;

public class Calculator {
	
	//this is calculator test
	  public int add(int ...a) 
	    { 
	       
	       int sum=0;
	        // using for each loop to display contents of a 
	        for (int i: a) {
	            sum=sum+i;
	        }
	       return sum;
	    } 
	  
	  public int mul(int ...a) 
	    { 
	       
	       int mul=1;
	        // using for each loop to display contents of a 
	        for (int i: a) {
	            mul=mul*i;
	        }
	       return mul;
	    } 
	  

	

}

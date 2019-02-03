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
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator a=new Calculator();
		System.out.println(a.add(2,3,4,5));
		System.out.println(a.mul(2,3,4,5));

	}

}

package com.oracle.test1;

public class HelloGradle {

	  public String sayHello() {
	      return "Hello Gradle";
	   }

	   public static void main(String[] args) {
		   HelloGradle app = new HelloGradle();
	      System.out.println(app.sayHello());
	      
	        Calculator a=new Calculator();
			System.out.println(a.add(2,3,4,5));
			System.out.println(a.mul(2,3,4,5));

	   }

}

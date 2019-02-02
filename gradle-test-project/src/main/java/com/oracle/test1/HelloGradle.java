package com.oracle.test1;

public class HelloGradle {

	  public String sayHello() {
	      return "Hello Gradle";
	   }

	   public static void main(String[] args) {
		   HelloGradle app = new HelloGradle();
	      System.out.println(app.sayHello());
	   }

}

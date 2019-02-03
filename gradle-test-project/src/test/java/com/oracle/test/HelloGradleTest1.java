package com.oracle.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.oracle.test1.HelloGradle;

public class HelloGradleTest1 {

	HelloGradle app = new HelloGradle();
	 @Test
	   public void testSayHello() {
		 
	     assertNotNull("Success", app.sayHello());
	   }
}

package com.oracle.test1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelloGradleTest1 {

	 @Test
	   public void testSayHello() {
		 HelloGradle app = new HelloGradle();
	     assertNotNull("Success", app.sayHello());
	   }
}

package com.oracle.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.oracle.test1.HelloGradle;

public class HelloGradleTest1 {

	 @Test
	   public void testSayHello() {
		 HelloGradle app = new HelloGradle();
	     assertNotNull("Success", app.sayHello());
	   }
}

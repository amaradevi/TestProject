package com.oracle.test;



import org.junit.Test;

import com.oracle.test1.Calculator;

public class CalculatorTest1 {
//this is calculator test
	Calculator cal=new Calculator();
	 @Test
	   public void testAddition() {
		 
		 org.junit.Assert.assertTrue("Success", cal.add(2,3,4)==9);
	  }
	 
	 @Test
	   public void testAddition1() {
		 
		 org.junit.Assert.assertTrue("Success", cal.add(2,3)==5);
	  }
	 
	 
	 @Test
	   public void testMul1() {
		 
		 org.junit.Assert.assertTrue("Success", cal.mul(2,3,4)==24);
	  }
	 
	 @Test
	   public void testMul2() {
		 
		 org.junit.Assert.assertTrue("Success", cal.mul(2,3,5)==30);
		 
	  }
}

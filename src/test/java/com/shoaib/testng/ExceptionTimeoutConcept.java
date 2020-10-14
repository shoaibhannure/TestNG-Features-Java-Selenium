package com.shoaib.testng;

import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

@SuppressWarnings("deprecation")
public class ExceptionTimeoutConcept {
	
	
//If a Test Case is stuck in some infinite Loop then we use invocationTimeout feature
//To Handle Exception Error we use expectedExceptions keyword.	 
	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteloop(){
	int i=1;
	while(i==1){
		System.out.println(i);
	}
	}
	@Test(expectedExceptions=NumberFormatException.class)
	public void handleException(){
		String x="200A";
	     Integer.parseInt(x);
		
	}
	
	//Note we must never write infinite Loop in our Code. We should avoid Infinite Loops
	}



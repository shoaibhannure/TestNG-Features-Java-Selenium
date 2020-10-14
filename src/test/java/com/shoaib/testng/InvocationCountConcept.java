package com.shoaib.testng;

import org.testng.annotations.Test;

/*
 * 
 * @Author:- Shoaib Hannure
 * 
 */
public class InvocationCountConcept {
	
@Test(invocationCount=10)
//Invocation Keyword is used if we want to execute a method n no of times
public void sum(){
	int a=5;
	int b=6;
	int c=a+b;
	System.out.println("Sum of a & b is  "+c);
}

@Test(invocationCount=5)
public void substractionb(){
	int i=10;
	int j=5;
	int k=i-j;
	System.out.println("Substraction of i & j is  "+k);
}

//The Total Test Run of two Methods will be addition of invocation Coun t
}

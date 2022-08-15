package testNG_P;

import org.testng.annotations.Test;

public class InvocationCountTest {
  
	@Test (invocationCount=8)
  public void sum() {
		int a = 10;
		int b = 20;
		int c =a+b;
		System.out.println("Sum is "+c);
		
		//Whenever we want to repeat same test case for specific time we use "InvocationCount" keyword
  }
}

package testNG_P;

import org.testng.annotations.Test;

public class PrioritySequence {

	@Test(priority= -4)
  public void a() {
		System.out.println("login test");
  }
	
	@Test(priority= 2)
	public void b() {
		System.out.println("home page test");
	}
	
	@Test(priority= 1)
	public void c() {
		System.out.println("search page test");
	}
	
	@Test(priority= 0)
	public void d() {
		System.out.println("Registration Page Test");
	}
	
	//Note:  priority can be  
	//i. bydefault=0	ii. +ve integer	iii. -ve integer	iv. Duplicate
	//Preferences are: - , 0 , +

}

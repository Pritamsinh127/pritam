package testNG_P;

import org.testng.annotations.Test;

public class DependancyStudy {
  
	@Test
  public void logintest() {
		System.out.println("login test");
		int a=3/0;
  }
	
	@Test(dependsOnMethods="logintest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="homePageTest")
	public void searchPageTest() {
		System.out.println("search page test");
	}
	
	@Test
	public void RegistrationPageTest() {
		System.out.println("Registration Page Test");
	}
}

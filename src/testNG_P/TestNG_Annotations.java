package testNG_P;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for browser");
	}
	
	@BeforeTest
	public void launch() {
		System.out.println("Launch browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login to the app");
	}
	
	@BeforeMethod
	public void url() {
		System.out.println("Enter the url");
	}
	
	@Test
	public void googleTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}
	
	void a() {
		System.out.println("----------------------Test case 2----------------------");
	}
	
	@BeforeMethod
	public void url1() {
		System.out.println("Enter the url");
	}
	
	@Test
	public void logoTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logout1() {
		System.out.println("Logout from app");
	}
	
	@AfterClass
	public void close() {
		System.out.println("Close browser");
	}
	
	@AfterTest
	public void deletCookies() {
		System.out.println("Delet all cookies");
	}
	
	
}

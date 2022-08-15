package testNG_P;

import org.testng.annotations.Test;

public class ParallelExecution {
  
	@Test
	public void a() {
		System.out.println("Method 1");
	}
	
	@Test(priority=-1)
	public void b() {
		System.out.println("Method 2");
	}
	
	@Test
	public void c() {
		System.out.println("Method 3");
	}
	
	@Test(priority=-2)
	public void d() {
		System.out.println("Method 4");
	}
	
	@Test
	public void e() {
		System.out.println("Method 5");
	}
}

package testNG_P;

import org.testng.annotations.Test;


public class SoftAssert {
  
	@Test
	public void myMethod()
	 {
	String a="test";
	String b=null;
				
	SoftAssert sa= new SoftAssert();
	
	sa.assertNotNull(b, "TC is failed value is Null");
	sa.assertNull(a, "TC is failed value is Not Null");
	sa.assertAll();
	 
	 }

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	private void assertNull(String a, String string) {
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(String b, String string) {
		// TODO Auto-generated method stub
		
	}
	

	
}

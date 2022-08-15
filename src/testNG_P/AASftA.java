package testNG_P;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AASftA {
	
	@Test
	public void abc() {
		
		String ExpectedResult="Abcd";
		String ActualResult="Abc";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
		Reporter.log("TC1 is running", true); 
	}
	
	@Test
	public void pqr() {
		
		String a="demo";
		String b= null;
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertNotNull(b, "TC is failed value is Null");
		sa.assertNull(a, "TC is failed value is Not Null");
		sa.assertAll();
	}
}

package testNG_P;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAsserts {
  
	//1] assertEquals()
	@Test
	 	public void TC1() {
			String ExpectedResult="Abcd";
			String ActualResult="Abc";
	 
			Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
			Reporter.log("TC1 is running", true);
		}
	
	//2] assertNotEquals()
	@Test
		public void TC2() {
			String ExpectedResult="VCTCPune";
			String ActualResult="VCTC";
			
			Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is matching");
			Reporter.log("TC2 is running", true);
		}

	//3] assertTrue()
	@Test (enabled = false)
	 	public void TC3() {
			//boolean output= Title.isSelected();
			//boolean output= Title.isEnabled();
			//boolean output= Title.isMultiple();
			//boolean output= Title.isDisplayed();
		boolean Result=false;
	 
		Assert.assertTrue(Result, "Result is false");
		Reporter.log("TC3 is running", true);
	 }
	
	//4] assertFalse()
	@Test(enabled = false)
		public void TC4() {
			//boolean output= Title.isDisplayed();
			boolean Result=true;
	 
			Assert.assertFalse(Result,"Result is true");
			Reporter.log("TC4 is running", true);
	 	}

	//5] assertNull()
	@Test(enabled = false)
		public void TC5() {
			String str=null;
			
			Assert.assertNull(str,"Value is not null");
			Reporter.log("TC5 is running", true);
		}

	//6] assertNotNull()
	@Test (enabled = false)
	 	public void TC6() {
			String str="ABC";
			
			Assert.assertNotNull(str,"Value is null");
			Reporter.log("TC6 is running", true);
		}

	//7] fail()
	@Test
	 	public void TC7() {
			Reporter.log("Assert fail check", true);
			
			Assert.fail();
			Reporter.log("TC7 is running", true);
	 	}

}

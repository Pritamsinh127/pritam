package kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPPage {
	
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath= "//button[@type='submit']") private WebElement continuebutton;
	
	public KitePinPPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin()
	{ pin.sendKeys("982278"); }
	
	public void clickOnContinueButton()
	{ continuebutton.click(); }
}

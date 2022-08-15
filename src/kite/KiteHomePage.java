package kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath="//span[text()='ELR321']") private WebElement userprofile;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userprofile()
	{ userprofile.click(); }
	
	public void clickOnLogout()
	{ logout.click(); }
}

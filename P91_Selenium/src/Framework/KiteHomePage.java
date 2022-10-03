package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[text()='OU9257']") private WebDriver profilename;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProfile()
	{
		
	}
	

}

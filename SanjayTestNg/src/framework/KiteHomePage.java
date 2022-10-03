package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy(xpath="//span[@class='user-id']") private WebElement ProfileName;
	
	public KiteHomePage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	
	
	public void verifyKiteHomePageProfileName(String expUserID)
	{
		String actUserID = ProfileName.getText();
		
		if(actUserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

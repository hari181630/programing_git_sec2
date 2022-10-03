package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_L1 {
	 @FindBy(xpath="")  private WebElement UN;
	// private WebElement UN=driv
	 @FindBy(xpath="")  private WebElement PWD;
	 @FindBy(xpath="")  private WebElement btn;
	public POM_L1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUN() {
		
	}
	public void enterPWD() {
		
	}
	public void enterBtn() {
		
	}
	 
}

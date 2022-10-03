package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_L2 {
	@FindBy(xpath="")private WebElement pin;
	//private WebElement pin=driver.findElement(xpath="");
	@FindBy(xpath="")private WebElement click;
	public POM_L2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterPin() {
		
	}
}

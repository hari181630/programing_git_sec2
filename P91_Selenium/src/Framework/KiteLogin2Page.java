package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {

	
	@FindBy(xpath="//input[@id=\\\"pin\\\"]") private WebElement pin;
	@FindBy(xpath="//button[text() ='Continue ']") private WebElement contiBtn;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPin()
	{
		pin.sendKeys("");
	}
	public void clickBtn()
	{
		contiBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

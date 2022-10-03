package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	@FindBy(xpath="//input[@id=\"userid\"]")private WebElement UN;
	//private WebDriver driver=driver.findElement("xpath path");
	@FindBy(xpath="//input[@id=\"password\"]") private WebElement Pwd;
	//private WebDriver driver=driver.findElement("xpath path");
	@FindBy(xpath="//button[@class=\"button-orange wide\"]")private WebElement Btn;
	//private WebDriver driver=driver.findElement("xpath path");
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUn()
	{
		UN.sendKeys("OU9257");
	}
	public void enterPWD()
	{
		Pwd.sendKeys("Kale@143");
	}
	public void clickBTn() {
		Btn.click();
	}
	
}

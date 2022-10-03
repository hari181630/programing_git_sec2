package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pkg1.Webdriver;

public class KiteLoginPage1 {
		
	
	@FindBy(xpath="//input[@id=\\\"userid\\") private WebElement USN;
	@FindBy(xpath="//input[@id=\\\"password\\\"]") private WebElement PassWord;
	@FindBy(xpath="//button[text()=\\\"Login \\\"]") private WebElement login;
	
	public  KiteLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void entrUSN()
	{
		USN.sendKeys("OU9257");
	}
	public void enterPassWord()
	{
		PassWord.sendKeys("Kale@143");
	}
	public void enterLogin()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
}

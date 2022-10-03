package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	private By emailID = By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]");
	
	private By passWord= By.xpath("//input[@type=\"password\"]");
	
	private By submitBtn= By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]");
	
	public LoginPage()
	{
	
	}
	
	public void enterMailId()
	{
		driver.findElement(emailID).sendKeys("9527675453");
	}
	public void enterPassWord()
	{
		driver.findElement(passWord).sendKeys("1419@Hari");
	}
	public void submitBtn()
	{
		driver.findElement(submitBtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

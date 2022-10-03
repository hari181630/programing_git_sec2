package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	boolean result = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).isEnabled();
	System.out.println(result);
	if(result==true)
	{
		System.out.println("text is enabled");
	}
	else
	{
		System.out.println("test is not enabled");
	}
	
}
}

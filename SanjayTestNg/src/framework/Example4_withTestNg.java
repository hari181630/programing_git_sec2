package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example4_withTestNg {

	@Test
	public void m1()
	{
		System.out.println("hello");
		
	}
	public void m2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
}

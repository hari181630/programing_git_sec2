package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example13_Parallel1 {

	@Test
	public void openFacebookApp() throws InterruptedException
	{		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
        WebDriver driver1 =new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver1.close();
		
		
	}
}

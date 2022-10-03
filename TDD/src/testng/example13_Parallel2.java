package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example13_Parallel2 {

	@Test
	public void openKiteApp() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\July21A_Selenium_Soft\\chromedriver_win32 (15)\\chromedriver.exe");
		
		WebDriver driver1 =new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://kite.zerodha.com/");
		
		Thread.sleep(5000);
		
		driver1.close();
		
	}
	
	
	
}

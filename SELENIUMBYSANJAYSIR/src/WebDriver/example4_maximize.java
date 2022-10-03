package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_maximize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\SELENIUM\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}

}

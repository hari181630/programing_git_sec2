package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.manage();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	
//		String k =driver.getTitle();
//		Thread.sleep(2000);
//	WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
//	
	///html/body/div[2]/div/div/button
		
}
}

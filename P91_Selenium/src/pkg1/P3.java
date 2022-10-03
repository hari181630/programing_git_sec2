package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement element=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\""));
			element.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//svg[@class xmlns=\"http://www.w3.org/2000/svg\"]")).click();
			
			}

}

package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleIframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		
	driver.switchTo().frame("iframeResult");
		//click on the data and time page
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		Thread.sleep(2000);
		//click on home page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();//a[@id='tryhome'];
	}

}

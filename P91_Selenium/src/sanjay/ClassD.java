package sanjay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassD {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");//to open this site in browser
	
	Thread.sleep(2000);//this is for wait sometime
	
	driver.manage().window().minimize();
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.amazon.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.close();
}
}

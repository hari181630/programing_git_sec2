package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	System.out.println("hello");

	driver.get("https://www.flipkart.com/");
	//webdriver is an interface we dont create object so we create reference and get child 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
	element.click();
	 WebElement search = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
	 search.sendKeys("samsung tv");
	 search.click();
	 search.click();
	
}
}

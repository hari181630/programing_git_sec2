package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\\\SELENIUM\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	//driver.manage();
	//Thread.sleep(2000);
	driver.manage().window().maximize();//this is minimise the browser
	WebElement element =driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"][1]"));//.sendKeys("samsung mobile");//sendKeys("samsung");
	Thread.sleep(2000);
	element.sendKeys("samsung");
	Thread.sleep(5000);
	element.click();
	element.click();
	//WebElement element = driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"][1]");
//	Thread.sleep(5000);
//	
	
	
	
	
}
}

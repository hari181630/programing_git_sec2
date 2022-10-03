package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassC {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E://SELENIUM//chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	
//	String k = driver.getTitle();
//	Thread.sleep(2000);
//	
	
	
}
}

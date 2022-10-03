package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
//	boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
//	System.out.println(result);
	String text=driver.findElement(By.xpath("//input[@id='email']")).getText();
	System.out.println(text);
	
	//System.out.println(text);
	
}
}

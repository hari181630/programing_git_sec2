package March01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isDisplayed {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(logo);
	if(logo==true)
	{
		System.out.println("facebook element is found");
	}
	else
	{
		System.out.println("facebook element is not found");
	}
	driver.quit();
//	logo.isDisplayed();
	//System.out.println(logo.isDisplayed());
}
}

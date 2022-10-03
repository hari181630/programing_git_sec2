package akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	Thread.sleep(2000);
	 WebElement femalebtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	 femalebtn.click();
	boolean result = femalebtn.isSelected();
	
	System.out.println(result);
	
	
	
	
	
	
	
}
}

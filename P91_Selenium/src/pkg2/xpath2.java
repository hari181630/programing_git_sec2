package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage();
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"][1]"));
		checkbox.sendKeys("samsung");
		checkbox.click();
	}

}

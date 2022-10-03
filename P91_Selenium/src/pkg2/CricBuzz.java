package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement score =driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]"));//
		score.sendKeys("Hari");
		Thread.sleep(2000);
		score.click();
		WebElement surname=driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"][2]"));
		score.click();
		
}
}

	
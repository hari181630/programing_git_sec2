package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgramSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("filpcart");
		searchbox.click();
		searchbox.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=\"RNNXgb\"]")).click();
		//driver.close();
		System.out.println("test passed");
		
		
		
	}

}

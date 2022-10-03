package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action6_Handling_of_Customise_listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//step1 identify the webelement
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		//step1 identify the webelement
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		//step 2 
		Actions act = new Actions(driver);
		//step3
		act.click(month).perform();
		Thread.sleep(2000);
		//step4 
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		{L		
			
		}
	}

}

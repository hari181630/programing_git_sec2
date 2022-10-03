package sanjay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");//to open this site in browser
		
		Thread.sleep(2000);//this is for wait sometime
		
		WebElement click=driver.findElement(By.xpath("/button/[@class=\"L0Z3Pu\"]"));
	click.sendKeys("samsung");
		click.click();
		
	}

}

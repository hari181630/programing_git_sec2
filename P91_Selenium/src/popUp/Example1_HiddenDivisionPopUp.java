package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		//webdriver is an interface we dont create object so we create reference and get child 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU' and @type='text']"));
		  username.sendKeys("9527675453");
		  boolean select = username.isSelected();
		  System.out.println(select);
		  Thread.sleep(2000);
		  WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		  password.sendKeys("1419@Hari");
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  

	}

}

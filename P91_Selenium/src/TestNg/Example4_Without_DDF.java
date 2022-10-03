package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_Without_DDF {

	public static void main(String[] args) throws InterruptedException {
		//step 1 to set System.setProperty passing two parameter key and value
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		//step 2
		//create an object of chromedriver class and store
		//it in one reference with referebce webdriver interface
		WebDriver driver =new ChromeDriver();
		//step 3:maximise the browser
		//driver.manage().window().maximize();
		//step 4: open the browser
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//step 4: open the browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");

		//enter PWD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter Pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		
		//click on continue btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//get user ID
		String expUserID="DV1510";
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			
		if(actUserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}

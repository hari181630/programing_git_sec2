package Framework;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Without_DDF {

	

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//enter un
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("OU9257");
		
		//enter password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Kale@143");
				
		//click on btn
		driver.findElement(By.xpath("//button[text()=\"Login \"] ")).click();
		//enter pin
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("758815");
		// click continue button
		driver.findElement(By.xpath("//button[text() ='Continue ']")).click();//span[text()='OU9257']
		String expectedID="OU9257";
		//enter actualID
		String actualID = driver.findElement(By.xpath("//span[text()='OU9257']")).getText();
		//compare act vs exp id
		if(expectedID.equals(actualID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	
	
	
	}
}

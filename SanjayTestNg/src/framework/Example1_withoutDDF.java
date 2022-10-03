package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_withoutDDF {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(2000);
	
	//enter Un
	driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("OU9257");
	Thread.sleep(2000);
	
	
	//enter pwd		
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Kale@143");
	
	//click button
	driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("758815");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
	String actual="OU9257";
	String expeted="OU9257";
	//span[text()='OU9257']
	if(actual.equals(expeted))
	{
		System.out.println("pass");
		
		//System.out.println(text);
	}
	else
	{
		System.out.println("fail");
	}
}
}

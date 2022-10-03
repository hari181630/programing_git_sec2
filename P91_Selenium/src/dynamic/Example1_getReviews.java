package dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getReviews {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.flipkart.com/");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//click on close btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	//search mobile 
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus");

	//click on search icon
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();


	//get reviews
	String reviews = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
	System.out.println(reviews);





}
}

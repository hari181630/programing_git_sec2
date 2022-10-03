package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAccount {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("Harsha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhogale");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9356747577");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1419@Hari");
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day' and @name='birthday_day']"));
	Select s1=new Select(day);
	s1.selectByIndex(11);
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month' and @name='birthday_month']"));
	Select s2=new Select(month);
	s2.selectByVisibleText("Jan");
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year'  and  @name='birthday_year' and @title='Year' ]"));
	Select s3=new Select(year);
	s3.selectByValue("1995");
	driver.findElement(By.xpath("//label[text() ='Male']")).click();
	WebElement submit1 = driver.findElement(By.xpath("//button[@type='submit' and  @name='websubmit']"));
	submit1.click();
	
	
}
}

package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRadioBtn {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	//webdriver is an interface we dont create object so we create reference and get child 
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sharda");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Patil");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='u_3_g_Be']")).sendKeys("9356747577");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("1419@Hari");
//	Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	
//	driver.findElement(By.xpath(""));
	Select s = new Select(day);
//	s.selectByIndex(10);
	//Thread.sleep(2000);
	//select[@id='month']
//	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//	Select s1 = new Select(month);
//	s1.selectByVisibleText("Feb");
//	Thread.sleep(2000);
//	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//	Select s2 = new Select(year);
//	s.selectByValue("1998");
	
}
}

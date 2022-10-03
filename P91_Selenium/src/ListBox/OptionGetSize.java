package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionGetSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month' and @name='birthday_month']"));
	Select s2=new Select(month);
	List<WebElement> allMonth = s2.getOptions();
	int size =allMonth.size();
	System.out.println(size);
}
}

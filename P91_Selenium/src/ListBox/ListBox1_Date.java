package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_Date {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		//webdriver is an interface we dont create object so we create reference and get child 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//<HTML tag>[contains(@attribute_name,'attribute_value')]
		////a[contains(@id,'u_0_2_Ot')]
		//driver.findElement(By.xpath("//a[contains(@id,'u_0_2_Ot')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		//step1:find the dropdown path//select[@id='day']
		//WebElement Day =driver.findElement(By.xpath("//select[@title='Day']"));
		Thread.sleep(2000);
		//step 2:select the list path by using select class
		Select s = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		s.selectByVisibleText("2000");
		
		//System.out.println(s2);
		
		
		
		
		
	}

}

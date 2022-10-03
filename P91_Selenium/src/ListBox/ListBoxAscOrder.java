package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAscOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		//webdriver is an interface we dont create object so we create reference and get child 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(month);
		System.out.println(month.getText());

	}

}

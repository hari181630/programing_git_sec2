package defaultDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_SelectTag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String sign = signUp.getText();
		System.out.println(sign);
		signUp.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		//WebElement dropDown;
		Select sel = new Select(dropDown);
		sel.selectByIndex(8);
		//sel.selectByValue(sign)
		Thread.sleep(2000);
		sel.selectByValue("20");
		Thread.sleep(2000);
		sel.selectByVisibleText("24");
		
	}

}

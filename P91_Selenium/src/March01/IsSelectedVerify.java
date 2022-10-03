package March01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedVerify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createAcc.click();
		createAcc.click();
		Thread.sleep(5000);
		WebElement radiobtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean result = radiobtn.isSelected();
		if(result == true)
		{
			System.out.println("Element is already selected");
		}
		else
		{
			System.out.println("Element is not selected");
			radiobtn.click();
			boolean result1 = radiobtn.isSelected();
			if(result1 == true)
			{
				System.out.println("female radiobtn is click");
			}
			else
			{
				System.out.println("female radiobtn is not click");
			}
			
			
		}

	}

}

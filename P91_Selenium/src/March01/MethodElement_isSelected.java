package March01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodElement_isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createAcc.click();
		createAcc.click();
		Thread.sleep(5000);
		boolean radiobtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println(radiobtn);
		if(radiobtn == true)
		{
			System.out.println("element is tick");
		}
		else
		{
			System.out.println("element is not found");
		
			
			
		}
		
		

	}

}

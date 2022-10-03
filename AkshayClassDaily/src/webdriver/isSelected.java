package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"red\"]"));
		
		boolean check = checkbox.isSelected();
		System.out.println(check);
		if(check)
		{
			System.out.println("checkbox is not selected ");
		}
		else
		{
			checkbox.click();
			System.out.println("checkbox is selected");
		}
		//isDisplayed
		WebElement text = driver.findElement(By.xpath("//h2[@class=\"Heading2\"]"));
		if(text.isDisplayed())
		{
			System.out.println("text is Displayed");
		}
		else
		{
			System.out.println("text is not Displayed");
		}

	}

}

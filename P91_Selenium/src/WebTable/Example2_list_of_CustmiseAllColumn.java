package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_list_of_CustmiseAllColumn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///E:/WebTable1.html");
		Thread.sleep(2000);
		List<WebElement> allcol = driver.findElements(By.xpath("//tr/td[2]"));
		Thread.sleep(2000);
		for(int i=0;i<=allcol.size()-1;i++) {
		String text = allcol.get(i).getText();
		System.out.println(text);
		}
		//List<WebElement> allColumn = driver.findElements(By.xpath(""));
		
		
		
		
		
		
		
		
	}

}

package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("file:///E:/WebTable1.html");
	Thread.sleep(2000);
	
	List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
	int size = allRows.size();
	System.out.println(size);
	List<WebElement> rowData = driver.findElements(By.xpath("//tr[2]/td"));
	for(WebElement all:rowData)
	{
		System.out.print(all.getText()+" ");
	}
	System.out.println(rowData);
	int size1 = rowData.size();
	System.out.println(size1);
	String col2 = driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
	System.out.println(col2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}

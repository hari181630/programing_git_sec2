package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetParticularRow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.guru99.com/test/web-table-element.php#");
	Thread.sleep(2000);
	List<WebElement> title = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//thead//tr"));
	for(WebElement head:title)
	{	String t = head.getText();
		System.out.println(t);
		
	}
	//System.out.println(title);
	List<WebElement> particularRow = driver.findElements(By.xpath("//a[contains(text(),'Marico Ltd.					')]/parent::td/parent::tr"));
	for(WebElement oneRow:particularRow)
	{	String cell = oneRow.getText();
		System.out.println(cell);
	}
	
}
}

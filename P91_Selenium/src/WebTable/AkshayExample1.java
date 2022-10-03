package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AkshayExample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//calculate the number of column
		 List<WebElement> columnElement = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//thead//tr//th"));
		 int colcount = columnElement .size();
		 System.out.println("allColumn:"+colcount);
		 List<WebElement> rowsElement = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr"));
		 System.out.println("allRowsInTable:"+rowsElement .size()+" " );
		 for(WebElement k:columnElement)
		 {
			 System.out.print(k.getText()+"  ");
		 }
		 System.out.println();
		 List<WebElement> cell =driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr//td"));
		 int count=0;
		 for(WebElement k1:cell)
		 {
			 System.out.print(k1.getText()+"   ");
			 count++;
			 if(count == 5)
			 {
				 System.out.println();
				 count=0;
			 }
			 
		 }
		 
		 for(WebElement k:rowsElement)
		 {
			 System.out.println(k.getText()+"      ");
		 }
		 
	}

}

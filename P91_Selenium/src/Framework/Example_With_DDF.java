package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
	FileInputStream file = new FileInputStream("E:\\ExcelSheet1\\WITH_DDL.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//enter un
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(username);
		
		//enter password
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
				
		//click on btn
		
		driver.findElement(By.xpath("//button[text()=\"Login \"] ")).click();
		//enter pin
		String pin =sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(pin);
		// click continue button
		driver.findElement(By.xpath("//button[text() ='Continue ']")).click();//span[text()='OU9257']
		String expectedID="OU9257";
		//enter actualID
		String actualID = driver.findElement(By.xpath("//span[text()='OU9257']")).getText();
		//compare act vs exp id
		if(expectedID.equals(actualID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	

	}
}

package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("E:\\ExcelSheet1\\B1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe\\");

	WebDriver driver1 =new ChromeDriver();
	
	driver1.manage().window().maximize();
	
	driver1.get("https://kite.zerodha.com/");
	Thread.sleep(2000);
	
	//driver1.manage().timeouts().implicitlyWait(second(10), TimeUnit.SECONDS);
		
	//WebDriver driver = null;
	KiteLogin1Page login1=new KiteLogin1Page(driver1);
	login1.enterUn();
	login1.enterPWD();
	login1.clickBTn();
	
}

}
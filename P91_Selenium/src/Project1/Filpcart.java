package Project1;

import java.awt.Desktop.Action;
import java.io.File;

import javax.imageio.stream.FileImageOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpcart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
//		FileImageOutputStream f = new FileImageOutputStream(SrcFile);
		
		File DestFile=new File("c://test.png");
//		FileUtils.copyFile(SrcFile, DestFile);
		
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		WebElement login = driver.findElement(By.xpath("(//div[@class=\"_28p97w\"])[1]"));
//		Thread.sleep(2000);
//		act.moveToElement(login).perform();
//		Thread.sleep(4000);
//		WebElement create_Acc = driver.findElement(By.xpath("//a[@class=\"_14Me7y\" and text() = 'New to Flipkart? Create an account']"));
//		Thread.sleep(4000);
//		create_Acc.click();
//		WebElement mobile_no =driver.findElement(By.xpath("//input[@maxlength=\"10\"]"));
//		mobile_no.sendKeys("9527675453");
//	mobile_no.click();
//		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
//		//button.click();
//		driver.findElement(By.xpath("//a[@class=\"_14Me7y\" and text() = 'New to Flipkart? Create an account']\r\n"+ "	"));
		
		//a[@class="_14Me7y" and text() = 'New to Flipkart? Create an account']
	
	}

}

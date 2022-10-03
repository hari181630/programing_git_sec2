package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ChildBrowserPopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//click on new tab
	driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
	//training from child browser window
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	
	
	

}
}

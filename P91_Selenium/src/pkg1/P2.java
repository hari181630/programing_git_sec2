package pkg1;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  WebDriver driver1 = new ChromeDriver();//duplicate object are allowed but reference is not allowed
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  //driver.manage().window().setsize();
//	  Point setpoint = new Point(400,500);
//	  driver.manage().window().setPosition(setpoint);
	  driver.quit();
}
}

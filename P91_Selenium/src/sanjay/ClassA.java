package sanjay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");//to open this site in browser
	
	Thread.sleep(2000);//this is for wait sometime
	
	driver.manage().window().minimize();//this is minimise the browser
	
	Thread.sleep(2000);//this is for wait sometime
	
	driver.manage().window().maximize();//this is maximise the browser
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.amazon.com/");//to open new website in broser
	
	Thread.sleep(2000);
	
	driver.navigate().forward();//this is for go to forward page in the browser
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.manage().window().minimize();
	
	
	
	
	
	
	
}
}

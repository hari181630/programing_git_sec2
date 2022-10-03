package P3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\Hari Selenium Learn\\chromedriver.exe");
	
	//step2: create object of chromedriver class
	//ChromeDriver driver =new ChromeDriver();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
}
}

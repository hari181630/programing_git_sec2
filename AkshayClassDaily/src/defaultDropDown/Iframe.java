package defaultDropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	
	
	
	
}
}

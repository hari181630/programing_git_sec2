package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SELENIUM\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		Thread.sleep(5000);
//		driver.manage();
//		Thread.sleep(2000);
	}
}

package PPPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Hari Selenium Learn\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
	}

}

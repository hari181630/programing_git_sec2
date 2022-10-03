package Webdriver_M;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vaibhav\\IEDriverServer_x64_4.2.0.zip\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");

	}

}

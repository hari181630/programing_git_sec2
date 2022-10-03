package ScreenShot;


import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Example1 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	 File srnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File desti = new File("E:\\SELENIUM\\first1.jpg");
	 FileHandler.copy(srnshot, desti);
} 
}

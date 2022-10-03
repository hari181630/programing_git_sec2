package webdriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		//driver.quit();
		driver.manage().window().setPosition(new Point(100,200));
		System.out.println("Windows position X coordinates is-->"+driver.manage().window().getPosition().getX());
		System.out.println("Windows position Y coordinates is-->"+driver.manage().window().getPosition().getY());

		//driver.get("https://www.flipkart.com/");
	}
}

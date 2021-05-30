package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWay2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Documents/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		System.out.println("Successfully moved to iFrame");

		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.close();

	}

}

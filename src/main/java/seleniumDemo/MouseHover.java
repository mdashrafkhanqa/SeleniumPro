package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement Content = driver.findElementByClassName("menulink");

		Actions action = new Actions(driver);
		action.moveToElement(Content).perform();
		driver.findElementByXPath("//a[text()='Articles']").click();
		
		Thread.sleep(3000);
		driver.close();

	}

}

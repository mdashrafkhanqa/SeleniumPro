package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Documents/Drivers/chromedriver");

		// Syntax of create of object of ChromeDriver class
		// ClassName object = new ClassName();

		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// driver.get("http://leaftaps.com/opentaps");

		// Maximize window
		driver.manage().window().maximize();

		// Close browser
		driver.close();

	}

}

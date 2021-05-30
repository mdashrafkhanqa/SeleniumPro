package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlart {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void simpleAlart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Documents/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
		
		String SimpleAlertText = driver.switchTo().alert().getText();
		System.out.println(SimpleAlertText);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.close();
		driver.quit();


	}

}

package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		// load URL
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}

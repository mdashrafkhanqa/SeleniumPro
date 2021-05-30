package testNGPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditLead_TestCase_03 {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Documents/Drivers/chromedriver");
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//implecitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
	}
	
	@Test
	public void editLead() {
		// click leads link
		driver.findElementByLinkText("Leads").click();
		// click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		// click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}

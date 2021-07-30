package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//load URL
		driver.get("http://leaftaps.com/opentaps");

		//maximize browser window
		driver.manage().window().maximize();

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Print current title
		System.out.println(driver.getTitle());

		//Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		// company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter firstName						
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");

		//select source-(DropDown)
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Partner");
		
		//Select MKT
		WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mktcam);
		dd1.selectByValue("CATRQ_CARNDRIVER");
		
		//Select INd
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(7);
		
		// select ownership
		WebElement ownship = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd3 = new Select(ownship);
		dd3.selectByVisibleText("Corporation");
		
		Thread.sleep(4000);
		driver.close();

	}

}

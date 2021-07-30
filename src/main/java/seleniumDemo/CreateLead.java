package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");

		// create object of ChromeDriver class
		// ClassName object = new ClassName();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		// verify title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// enter password
		driver.findElementById("password").sendKeys("crmsfa");

		// click login
		driver.findElementByClassName("decorativeSubmit").click();

		// click CRM/SFA
		// Explicitly wait
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();

		driver.getTitle();
		System.out.println(driver.getTitle());

		// click create lead link
		driver.findElementByLinkText("Create Lead").click();

		// enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		// enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

		// enter title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");

		// enter description
		driver.findElementById("createLeadForm_description").sendKeys("It's a Software company");

		// enter department
		driver.findElementById("createLeadForm_departmentName").sendKeys("mkt");

		// click create lead btn
		driver.findElementByName("submitButton").click();

		// close browser
		driver.close();

	}

}

package miscellaneousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLead_WebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		//create object of ChromeDriver class
		//ClassName object = new ClassName();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//verify title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		//Implicitly wait		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
		//enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		try {
		driver.findElementByXPath("//input[@id='username1']").sendKeys("DemoSalesManager");
		System.out.println("UserName enter successfully");
		
		}catch(Exception e) {
			System.err.println("UserName not enter successfully");
			
		}

		//enter password
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		
		//click login
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//input[@value='Login']").click();
		
		//click CRM/SFA
		//Explicitly wait
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		
				
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//click create lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		//enter FirstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//enter title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
		
		//enter description
		driver.findElementById("createLeadForm_description").sendKeys("It's a Software company");
		
		//enter department		
		driver.findElementById("createLeadForm_departmentName").sendKeys("mkt");
		
		//click create lead btn
		driver.findElementByName("submitButton").click();
		
		//WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));	
		
		driver.close();

	}

}

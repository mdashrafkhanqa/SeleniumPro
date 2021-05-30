package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticingXPath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Documents/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// driver.getTitle();
		System.out.println(driver.getTitle());

		// Attribute Base Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// Partial Base Xpath
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();

		// Parent to Child Navigator/Travel Xpath
		driver.findElement(By.xpath("//div[@id='label']/a")).click();

		System.out.println(driver.getTitle());

		// Text Base Xpath
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Parent Child
		// driver.findElement(By.xpath("//div[@id='button']/a")).click();

		// Attribute Base Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hema");

		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Maa");

		// DropDown Using Attribute Base Xpath
		// WebElement src =
		// driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));

		WebElement src = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select slt = new Select(src);
		// slt.selectByVisibleText("Employee");
		// slt.selectByIndex(4);
		slt.selectByValue("LEAD_EMPLOYEE");

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Mamun");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Hossain");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("11/11/2020");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Mrs");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Sales");
		// driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("$1000");

		driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']/option[4]")).isDisplayed();

		WebElement ind = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select slt2 = new Select(ind);
		// slt2.selectByIndex(5);
		slt2.selectByVisibleText("Finance");

		WebElement ownship = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select slt3 = new Select(ownship);
		// slt3.selectByValue("OWN_PUBLIC_CORP");
		slt3.selectByIndex(5);

		WebElement currency = driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
		Select slt4 = new Select(currency);
		slt4.selectByValue("USD");

		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@name='sicCode']")).sendKeys("abc123");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is a Description");
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("XYZ");

		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("1432");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='primaryPhoneAskForName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='generalToName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='generalAttnName']")).sendKeys("def");
		driver.findElement(By.xpath("//input[@name='generalAddress1']")).sendKeys("123 Abc Road");
		driver.findElement(By.xpath("//input[@name='generalAddress2']")).sendKeys("Apt 1A");
		driver.findElement(By.xpath("//input[@name='generalCity']")).sendKeys("Queens");

		WebElement province = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select slt5 = new Select(province);
		slt5.selectByVisibleText("New York");

		driver.findElement(By.xpath("//input[@name='generalPostalCode']")).sendKeys("11432");
		driver.findElement(By.xpath("//input[@name='generalPostalCodeExt']")).sendKeys("12345");

		WebElement country = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select slt6 = new Select(country);
		slt6.selectByValue("USA");

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(3000);

		// driver.getTitle();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		driver.close();
		driver.quit();
	}

}

package miscellaneousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsDisplayed_IsEnable_IsSelected {

	public static void main(String[] args) {

		/*
		 * WebDriver driver;
		 * 
		 * WebDriverManager.chromedriver().setup();
		 */

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Load url
		// driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

		// get title of the page
		// System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);

		// Assertion
		Assert.assertEquals(title, "Bank of America | Online Banking | Sign In | Online ID", "Asserting page Title");

		// isDisplayed(); -"Bank of America" Logo is displayed (true/false)
		boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();

		// Assertion
		Assert.assertTrue(logo, "logo is displayed");

		// isEnabled() -Get The App link is Enable(true/false)
		boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]"))
				.isEnabled();
		if (getTheAppLink == true) {
			System.out.println("The Get the App link is Enabled");
		} else {
			System.out.println("The Get the App link is not Enabled");
		}

		// sign in to OrangeHRM
		/*
		 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 * driver.findElement(By.linkText("Admin")).click();
		 */

		// isSelected();-to do this validation we can use only-RadioButton,a CheckBox &
		// Drop-down (true/false)
		// 1st click on the "Save this online Id CheckBox"(select) then verify
		// isSelected() otherwise else part will be work
		driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
		boolean SaveThisOnlineIdCheckbox = driver.findElement(By.xpath("//div[@class='remember-info']/input "))
				.isSelected();
		System.out.println(SaveThisOnlineIdCheckbox);

		// Assertion
		Assert.assertTrue(SaveThisOnlineIdCheckbox, "SaveThisOnlineId CheckBox is selected");

		// Validation
		if (SaveThisOnlineIdCheckbox == true) {
			System.out.println("The checkbox is Selected");
		} else {
			System.out.println("The checkbox is not Selected");
		}

		// driver.quit();
	}

}

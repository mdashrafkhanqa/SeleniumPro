package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Switch to Frame: Way-1
		/*
		 * driver.switchTo().frame("iframeResult");
		 * System.out.println("Successfully moved to iFrame"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='fname']")).clear();
		 * driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aaraf");
		 * System.out.println("First Name: Aaraf"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='lname']")).clear();
		 * driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Khan");
		 * System.out.println("Last Name: Khan"); Thread.sleep(2000);
		 * driver.switchTo().parentFrame();
		 * System.out.println("Successfully switch back to main HTML");
		 */
		
		// Switch to Frame: Way-2
		/*
		 * driver.switchTo().frame(0);
		 * System.out.println("Successfully moved to iFrame"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='fname']")).clear();
		 * driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aaraf");
		 * System.out.println("First Name: Aaraf"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='lname']")).clear();
		 * driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Khan");
		 * System.out.println("Last Name: Khan"); Thread.sleep(2000);
		 * driver.switchTo().parentFrame();
		 * System.out.println("Successfully switch back to main HTML");
		 */
		
		// Switch to Frame: Way-3
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iFrame);
		System.out.println("Successfully Switched to the Frame ");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aaraf");
		System.out.println("First Name: Aaraf");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='lname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Khan");
		System.out.println("Last Name: Khan");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		System.out.println("Successfully switch back to main HTML");
		
		driver.quit();

	}

}

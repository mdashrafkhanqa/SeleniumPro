package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Switch to Frame
		driver.switchTo().frame(0);

		WebElement src = driver.findElementById("draggable");
		WebElement dest = driver.findElementById("droppable");

		// WebElement Dragable = driver.findElementById("draggable");

		// WebElement Dropable = driver.findElementById("droppable");

		Actions action = new Actions(driver);

		Thread.sleep(3000);
		action.dragAndDrop(src, dest).perform();

		// Switch back from frame
		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

		// click Selectable
		driver.findElementByLinkText("Selectable").click();

		Thread.sleep(4000);
		driver.close();

	}

}

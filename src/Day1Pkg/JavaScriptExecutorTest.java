package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		//sometimes event is not getting fired using selenium script. then use javascripts (check below lines)
		//when many 3rd party applications are used in any website, use this approach eg. ORCA
		JavascriptExecutor executor = (JavascriptExecutor) driver; 

		WebElement myButton = (WebElement) executor.executeScript("return document.getElementById('myBtn')");

		boolean isEnabled = myButton.isEnabled();
		System.out.println("Is Enabled :" + isEnabled);
		driver.findElement(By.xpath(".//button[contains(text(),'Try it')]")).click();
		Thread.sleep(2000);
		isEnabled = myButton.isEnabled();
		System.out.println("Is Enabled :" + isEnabled);
		driver.quit();

	}

}

package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsButtonEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement myButton = driver.findElement(By.id("myBtn"));
		boolean isEnabled = myButton.isEnabled();
		System.out.println("Is Enabled :" + isEnabled);
		driver.findElement(By.xpath(".//button[contains(text(),'Try it')]")).click();
		Thread.sleep(2000);
		isEnabled = myButton.isEnabled();
		System.out.println("Is Enabled :" + isEnabled);
		driver.quit();
				
	}

}

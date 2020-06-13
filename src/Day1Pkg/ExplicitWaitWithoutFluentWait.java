package Day1Pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithoutFluentWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		
		//waiting for title to contain "Hello". Current title: "Google" (tried for 5 second(s) with 500 milliseconds interval)
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleContains("Hello"));
		
		Thread.sleep(2000);
		driver.quit();
	}

}

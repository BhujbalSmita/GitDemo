package Day1Pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionTitleWithFluentWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		//this is explicit wait example. it will wait for 10 seconds with the interval of 2 seconds to find title contains Hello. If not found after 10 seconds it will throw exception "waiting for title to contain "Hello". Current title: "Google" (tried for 10 second(s) with 2000 milliseconds interval)" 
		FluentWait<WebDriver> wait = new WebDriverWait(driver, 10).pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.titleContains("Hello"));
		Thread.sleep(2000);
		driver.quit();
	}

}

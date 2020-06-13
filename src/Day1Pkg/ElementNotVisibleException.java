package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotVisibleException {

	public static void main(String[] args) throws InterruptedException {
		
		//this program throws element not visible exception
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_toggle_hide_show");
		driver.switchTo().frame("iframeResult");
		WebElement butTry = driver.findElement(By.xpath(".//button[contains(., 'Try it')]"));
		Thread.sleep(2000);
		butTry.click();
		Thread.sleep(2000);
		WebElement divMyDiv = driver.findElement(By.xpath(".//div[contains(@id,'myDIV')]"));
		divMyDiv.click();
		Thread.sleep(2000);
		driver.close();
	}

}

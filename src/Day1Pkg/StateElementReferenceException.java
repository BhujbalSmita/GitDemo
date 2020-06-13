package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement btnTryIt = driver.findElement(By.xpath(".//button[contains(.,'Try it')]"));
		Thread.sleep(2000);
		driver.switchTo().parentFrame(); //come out from current frame ie IFrameResult
		Thread.sleep(2000);
		driver.switchTo().frame("ssIFrame_google"); 
		Thread.sleep(2000);
		btnTryIt.click();
	}	

}

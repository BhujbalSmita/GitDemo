package Day1Pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement butTryIt = driver.findElement(By.xpath(".//button[text()='Try it']"));
		Thread.sleep(2000);
		butTryIt.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Text:" + alertText);
		alert.accept();
		//Thread.sleep(5000);
		System.out.println("Alert has been closed");
	//	Thread.sleep(5000);
		driver.quit();
	}

}

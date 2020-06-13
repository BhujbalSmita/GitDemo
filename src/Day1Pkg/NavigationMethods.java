package Day1Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.get("https://gmail.com");
		Thread.sleep(2000);
		Navigation navigate = driver.navigate();
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
		Thread.sleep(2000);
		navigate.to("https://cucumber.io");
		Thread.sleep(2000);
		driver.quit();
	}

}

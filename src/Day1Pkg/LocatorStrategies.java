package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategies {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("search by name");
		Thread.sleep(2000);
		txtSearch.clear();
		driver.findElement(By.xpath(".//input[@title='Search']")).sendKeys("hello world");
		Thread.sleep(2000);
		txtSearch.clear();
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("how are you");
		Thread.sleep(2000);
		driver.quit();
		
	}

}

package Day1Pkg;

import java.util.ArrayList;

import org.openqa.selenium.By;

//import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.open()");  
		//for new tab, u need to use javascript...there is no other way to do this in selenium. Also there are 2 methods in javascript. 1 is Execute synchronusly which means unless and until this step is not executed "executeScript("window.open()", it should not go to next line. 2. is execute Asynchronusly which means it will not wait to execute this line  
		Thread.sleep(2000);
		ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.navigate().to("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation testing" +Keys.RETURN);
		driver.findElement(By.name("q")).sendKeys("Automation testing" +Keys.CONTROL,"a", Keys.DELETE); //try to use multiple keybord keys
		//driver.findElement(By.name("q")).sendKeys("hello" +Keys.CONTROL,"a");
		
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.name("q")).sendKeys("Manual testing" +Keys.RETURN);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		driver.quit();
		
		
	}

}

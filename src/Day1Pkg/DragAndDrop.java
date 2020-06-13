package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement wbSource = driver.findElement(By.xpath(".//div[@id='draggable']"));
		WebElement wbDestination = driver.findElement(By.xpath(".//div[@id='draggable']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(wbSource).moveToElement(wbDestination).release().build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}

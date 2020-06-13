package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_colspan");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement cell = driver.findElement(By.xpath(".//table[1]//tr[2]//td[1]")); //in table, row start from 1 to n and not from 0 to n
		String cellText = cell.getText();
		System.out.println("Get cell text by xpath: " +cellText);
		cellText = null;
		cell = driver.findElement(By.cssSelector("table tr:nth-child(2) td:nth-child(2)")); //body > table > tbody > tr:nth-child(2) > td:nth-child(2)
		Thread.sleep(2000);
		System.out.println("Get cell text by css:" +cell.getText());
		driver.quit();
	
	}

}

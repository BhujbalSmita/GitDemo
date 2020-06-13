package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_radio_checked2");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement redRadio = driver.findElement(By.id("red"));
		WebElement blueRadio = driver.findElement(By.id("blue"));
		boolean isRedSelected = redRadio.isSelected();
		System.out.println("Is red selected : " +isRedSelected);
		Thread.sleep(2000);
		if(!isRedSelected)
			redRadio.click();
		isRedSelected = redRadio.isSelected();
		System.out.println("Is selected after click : " +isRedSelected);
		Thread.sleep(2000);
		WebElement uncheckRed = driver.findElement(By.xpath(".//button[contains(text(), 'Uncheck \"Red\"')]"));
		uncheckRed.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

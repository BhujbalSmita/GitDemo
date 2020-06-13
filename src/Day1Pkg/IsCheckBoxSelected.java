package Day1Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsCheckBoxSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
//		System.out.println("launching chrome browser");
//		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1= new ChromeDriver();
		driver1.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_display_checkbox_text");
		Thread.sleep(2000);
		driver1.switchTo().frame("iframeResult");
		WebElement checkbox = driver1.findElement(By.id("myCheck"));
		boolean isSelected = checkbox.isSelected();
		System.out.println("Is Selected: " +isSelected);
		Thread.sleep(2000);
		if(!isSelected){
			checkbox.click();
			isSelected = checkbox.isSelected();
			System.out.println("Is selected after click :" +isSelected);
			Thread.sleep(2000);
			driver1.quit();
		}
	}

}
 
package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.Select;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		//Naukri.com
		driver.navigate().to("https://encodable.com/uploaddemo/");
		
		String DashboardTitle = driver.getTitle();
		System.out.println(DashboardTitle);
		
		//UploadFile
		WebElement UploadFile = driver.findElement(By.name("uploadname1"));
		UploadFile.click();
		
		//File Upload
				try {
					Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\ChromeBrowser.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				driver.wait(5000);
		//Begin Upload
//				WebElement UploadButton = driver.findElement(By.id("uploadbutton"));
//				UploadButton.click();
				

	}

}

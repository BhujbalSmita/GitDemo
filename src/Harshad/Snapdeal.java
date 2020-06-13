package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Snapdeal.com
		driver.navigate().to("https://snapdeal.com");
		driver.manage().window().maximize();
		
		WebElement SignIn = driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
		SignIn.click();
		
		WebElement Login = driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]"));
		Login.click();

		WebDriverWait w = new WebDriverWait(driver, 6);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeLogin"));
//		  try {
//			  
//			  driver.switchTo().frame(0);
//			  
//			       }
//			 catch (NoSuchFrameException e)
//			      {            
//			  
//			  System.out.println(e.getMessage());     
//			  
//			       }
		WebElement Text = driver.findElement(By.xpath("//*[@id='login-register-modal']/div/div[6]/p"));
		String S = Text.getText();
		System.out.println("HARSHAD " +S);

//		WebElement MobileNumber = driver.findElement(By.id("userName"));
//		boolean pass = MobileNumber.isEnabled();
//		if (pass)
//		{
//			MobileNumber.sendKeys("9876543210");
//		}
//		MobileNumber.sendKeys("9876543210");
//
//		WebElement ContinueButton = driver.findElement(By.xpath("//*[@id='checkUser']"));
//		ContinueButton.click();
		
	}

}

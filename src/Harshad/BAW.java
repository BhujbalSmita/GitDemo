package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class BAW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//BAW Website
		driver.navigate().to("https://10.4.2.85/ERG-Seattle-Institution/loginRedirect.do");
		driver.manage().window().maximize();
		String DashboardTitle = driver.getTitle();
		System.out.println(DashboardTitle);
		
		//User Name
		WebElement UserName = driver.findElement(By.xpath("//*[@id='j_username']"));
		boolean pass = UserName.isEnabled();
		if (pass)
		{
			UserName.sendKeys("2088");
		}
	
		//Password
		WebElement Password = driver.findElement(By.xpath("//*[@id='j_password']"));
		Password.sendKeys("sea.123");
		
		//Go
		WebElement Go = driver.findElement(By.xpath("//*[@id='container']/table/tbody/tr/td[1]/form/table/tbody/tr[2]/td/input[2]"));
		Go.click();
		
		//OrderCards
		WebElement OrderCards = driver.findElement(By.xpath("//*[@id='content']/form/table/tbody/tr[2]/td/div/ul/p/a[2]"));
		OrderCards.click();
		
		//Quantitiy
		WebElement Quantity = driver.findElement(By.xpath("//*[@id='quantity']"));
		Quantity.sendKeys("1");
		
		//OrderDescription
		WebElement OrderDescription = driver.findElement(By.xpath("//*[@id='orderDescription']"));
		OrderDescription.sendKeys("Auto Test");
		
		//Next
		WebElement Next = driver.findElement(By.xpath("//*[@id='confirm']"));
		Next.click();
		
		//BusinessPassPort
		WebElement BusinessPassPort = driver.findElement(By.xpath("//*[@id='element0']"));
		BusinessPassPort.click();
		
		//KCMPassPort
		WebElement KCMPassPort = driver.findElement(By.xpath("//*[@id='element1']"));
		KCMPassPort.click();
		
		//NextAddProducts
		WebElement NextAddProducts = driver.findElement(By.xpath("//*[@id='confirm']"));
		NextAddProducts.click();
		
		//WelcomeLogout
		WebElement WelcomeLogout = driver.findElement(By.xpath("//*[@id=\'toolbar\']/a[2]"));
		WelcomeLogout.click();
		
		//Logout
		WebElement Logout = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr/td[2]/a"));
		Logout.click();
		
		driver.close();
	}

}

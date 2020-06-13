package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Rediffmail.com
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		String titlemain = driver.getTitle();
		System.out.println(titlemain);
		driver.findElement(By.linkText("Create a new account")).click();
		//driver.findElement(By.linkText("Home")).click();
		String titlenewreg = driver.getTitle();
		System.out.println(titlenewreg);
		WebElement FullNameElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		WebElement LoginNameElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		WebElement CheckAvailabilityElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		WebElement PasswordElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input"));
		WebElement RePasswordElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input"));
		WebElement AlterEmailAddElement = driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input"));
		WebElement Mobile = driver.findElement(By.xpath("//*[@id='mobno']"));

//		WebElement RadioButton = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]"));
		
//		FullNameElement.sendKeys("Tutorial1");
//		LoginNameElement.sendKeys("Tutorial");
//		Alert alert = driver.switchTo().alert();
//		String s = alert.getText();
//		System.out.println(s);
//		alert.accept();
		FullNameElement.sendKeys("Harshad");
		LoginNameElement.sendKeys("harshad.apraj");
		PasswordElement.sendKeys("Harshad");
		RePasswordElement.sendKeys("Harshad");
		AlterEmailAddElement.sendKeys("name.surname@gmail.com");
		Mobile.sendKeys("9876543210");
		
		WebElement DayDropDown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select Day = new Select(DayDropDown);
		Day.selectByVisibleText("15");
		
		WebElement MonthDropDown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select Month = new Select(MonthDropDown);
		Month.selectByVisibleText("JUL");
		
		WebElement YearDropDown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select Year = new Select(YearDropDown);
		Year.selectByVisibleText("2000");
		
		WebElement CountryDropDown = driver.findElement(By.xpath("//*[@id='country']"));
		Select Country = new Select(CountryDropDown);
		Country.selectByVisibleText("India");	
		
		WebElement CityDropDown = driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		Select City = new Select(CityDropDown);
		City.selectByVisibleText("Mumbai");	
		
		CheckAvailabilityElement.click();
		
		//driver.close();
	}

}

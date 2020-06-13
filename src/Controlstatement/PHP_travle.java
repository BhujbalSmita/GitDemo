package Controlstatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHP_travle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Soft/geckodriver.exe");
		  String baseURL = "https://www.phptravels.net";
		WebDriver driver = new FirefoxDriver();
//		  WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		
//		// BAW website
//		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
		String DashboardTitle = driver.getTitle();
		System.out.println(DashboardTitle);

//		WebElement account = driver.findElement(By.xpath("//*[@id='collapse']/ul[1]/li[8]/a"));
//		System.out.println(account);
//		account.click();
//		
		
		WebElement account = driver.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//a//b"));
		account.click();
		
//		WebElement login = driver.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//ul//li[1]//a"));
//		login.click();
		
		WebElement signup = driver.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//ul//li[2]//a"));
		signup.click();
		
		WebElement firstname =  driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[3]//input"));
		firstname.sendKeys("xyz");
		System.out.println("Enter the first name as xyz");
		
		WebElement lastname = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[4]//input"));
		lastname.sendKeys("prq");
		System.out.println("Enter the last name as prq");
		
		WebElement mob = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[5]//input"));
		mob.sendKeys("1234567890");
		System.out.println("Enter the mob as 1234567890");
		
		WebElement email = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[6]//input"));
		email.sendKeys("XYZ@gmail.com");
		System.out.println("Enter the email as XYZ@gmail.com");
		
		WebElement passwd = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[7]//input"));
		passwd.sendKeys("12345678");
		System.out.println("Enter the passwd as 12345678");
		
		WebElement conformpw = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[8]//input"));
		conformpw.sendKeys("12345678");
		System.out.println("Enter the confirmpw as 12345678");
		
		WebElement sign = driver.findElement(By.xpath("//html//body//div[4]//section//div//div//div//div//div[3]//div//form//div[9]//button"));
		sign.click();
		System.out.println("Signup successfully");
		
		WebElement logout = driver.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//ul//li[2]//a"));
		logout.click();
		System.out.println("Logout successfully");
	}

}

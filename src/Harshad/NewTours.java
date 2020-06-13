package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//NewTours Website
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String DashboardTitle = driver.getTitle();
		System.out.println(DashboardTitle);
		
		//Username
		WebElement UserName = driver.findElement(By.name("userName"));
		UserName.sendKeys("Tutorial1");
		
		//Password
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Tutorial1");
		
		//Login
		WebElement login = driver.findElement(By.name("login"));
		login.click();	
		
		//RegistrationForm
		WebElement Registration = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/a"));
		Registration.click();	
		
		//FirstName
		WebElement FirstName = driver.findElement(By.name("firstName"));
		FirstName.sendKeys("Firstname");
		
		//LastName
		WebElement LastName = driver.findElement(By.name("lastName"));
		LastName.sendKeys("LastName");
		
		//Phone
		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("44445555");
		
		//Email
		WebElement Email = driver.findElement(By.name("userName"));
		Email.sendKeys("firstname.lastname@gmail.com");
		
		//Address1
		WebElement Address1 = driver.findElement(By.name("address1"));
		Address1.sendKeys("Address1");
		
		//Address2
		WebElement Address2 = driver.findElement(By.name("address2"));
		Address2.sendKeys("Address2");
		
		//City
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("Tutorial1");
		
		//State
		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys("Tutorial1");
		
		//Postal
		WebElement Postal = driver.findElement(By.name("postalCode"));
		Postal.sendKeys("Tutorial1");
		
		//Country
		WebElement Country = driver.findElement(By.name("country"));
		Country.sendKeys("INDIA");
		
		//User_name
		WebElement User_Name = driver.findElement(By.name("email"));
		User_Name.sendKeys("Tutorial1");
		
		//Pass_word
		WebElement Pass_word = driver.findElement(By.name("password"));
		Pass_word.sendKeys("Tutorial1");
		
		//RePass_word
		WebElement RePass_word = driver.findElement(By.name("confirmPassword"));
		RePass_word.sendKeys("Tutorial1");
		
		//Submit
		WebElement Submit = driver.findElement(By.name("register"));
		Submit.click();	
		
//		driver.close();
	}

}

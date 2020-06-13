package harshad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class Agency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Agency Website
		driver.navigate().to("https://10.4.2.86/ERG-Seattle-Agency/main.do");
		driver.manage().window().maximize();
		String DashboardTitle = driver.getTitle();
		System.out.println(DashboardTitle);
		
		WebElement UserName = driver.findElement(By.xpath("//*[@id=\'username\']"));
		UserName.sendKeys("o_wsfuser001");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\'password\']"));
		Password.sendKeys("sea.123");
		
		WebElement Login = driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/input"));	
		Login.click();
		
		String WelcomeTitle = driver.getTitle();
		System.out.println(WelcomeTitle);
		
		WebElement ManageRebate = driver.findElement(By.xpath("//*[@id=\'sitenav\']/ul[2]/li[3]/a"));	
		ManageRebate.click();
		
		
		for(int i=1;i<3;i++) {
		WebElement UploadNewFile = driver.findElement(By.xpath("//*[@id=\'content\']/form/p[4]/input[1]"));	
		UploadNewFile.click();
		
//		WebElement ChooseFile = driver.findElement(By.xpath("//*[@id=\'file\']"));	
//		ChooseFile.click();
		
		//
		WebElement ChooseFile = driver.findElement(By.xpath("//*[@id=\'file\']"));
		//ChooseFile.click();
		ChooseFile.sendKeys("D:\\PROJECT\\ORCA\\CR-14741\\rebate5pr98.xml");
		//
		WebElement UploadFile = driver.findElement(By.xpath("//*[@id='command']"));
		UploadFile.click();
		
		WebElement Comments = driver.findElement(By.xpath("//*[@id=\'comments\']"));
		Comments.sendKeys("N = " +i);
		
		WebElement AddComments = driver.findElement(By.xpath("//*[@id=\'addComment\']"));
		AddComments.click();
		
		WebElement ManageRebateAgain = driver.findElement(By.xpath("//*[@id=\'sitenav\']/ul[2]/li[3]/a"));	
		ManageRebateAgain.click();
		
		WebElement CheckBox = driver.findElement(By.name("rebateIds"));	
		CheckBox.click();	
		
//		WebElement AuthorizeRebates = driver.findElement(By.xpath("//*[@id=\'authorize\']"));	
//		AuthorizeRebates.click();	
		
		WebElement CancelRebates = driver.findElement(By.xpath("//*[@id='cancel']"));	
		CancelRebates.click();	
	
//		driver.wait(20);
		}
		
//		WebElement Logout = driver.findElement(By.xpath("//*[@id=\'toolbar\']/a[2]"));	
//		Logout.click();
//		
//		driver.close();	
	
	}

}


//SELECT * FROM WORK_ORDER 
//WHERE
//CREATED_BY='o_wsfuser001'
//ORDER BY WORK_ORDER_ID DESC;

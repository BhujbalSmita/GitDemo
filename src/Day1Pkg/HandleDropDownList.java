package Day1Pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement webElement = driver.findElement(By.xpath(".//select"));
		Select dropdown = new Select(webElement);
		List<WebElement> options = dropdown.getOptions();
		for(WebElement option : options){    //other way is use take size of element and then get text
			System.out.println(option.getText());
		}
		//Thread.sleep(2000);
		dropdown.selectByVisibleText("Audi");
		List<WebElement> allSelectedOptions = dropdown.getAllSelectedOptions();
		String abcd = allSelectedOptions.get(0).getText();
		if(abcd.contains("Audi")){
			System.out.println("Audi is selected");
		}
		else{
			System.out.println("some other option is selected");
		}
		
		System.out.println("Audi has been selected");
		Thread.sleep(2000);
		dropdown.selectByValue("saab");
		System.out.println("saab has been selected");
		dropdown.selectByIndex(0);
		System.out.println("Opel has been selected");
		Thread.sleep(2000);
		driver.quit();
				
	}

}

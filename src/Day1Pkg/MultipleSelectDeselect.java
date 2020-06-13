package Day1Pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select_multiple");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement webElement=driver.findElement(By.name("cars"));
		Select dropDownCar = new Select(webElement); //use when classic dropdown
		System.out.println("Is given dropdown multi select :" +dropDownCar.isMultiple());
		dropDownCar.selectByValue("volvo");
		Thread.sleep(2000);
		dropDownCar.selectByValue("audi");
		Thread.sleep(2000);
		/*dropDownCar.deselectByValue("audi");
		Thread.sleep(2000);
		dropDownCar.deselectByVisibleText("Fiat");
		Thread.sleep(2000);
		System.out.println("Selected options are :");
		List<WebElement> allSelectedOptions = dropDownCar.getAllSelectedOptions();
		
		for(WebElement allSelectedOption : allSelectedOptions)
		{
			System.out.println(allSelectedOption.getText());
		}
		dropDownCar.deselectAll();
		Thread.sleep(2000);
		List<WebElement> options = dropDownCar.getOptions();
		for(WebElement option : options){    //other way is use take size of element and then get text
			System.out.println("all options are: " +option.getText());
		}*/
		
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//div[contains(@class, 'w3-container w3-large w3-border')]"));
		System.out.println(e.getText());
		
		driver.quit();
	}

}

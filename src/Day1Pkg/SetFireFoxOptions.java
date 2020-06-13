package Day1Pkg;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetFireFoxOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		FirefoxOptions options = new FirefoxOptions();
		//options.addArguments("start-maximized");  //for firefox
		//options.addPreference("intl.accept_languages", "fr");  //for firefox
		//options.addArguments("headless");
		//options.addArguments("start-fullscreen");
		//options.addArguments("--incognito");
		//options.addArguments("--disable-notifications");
		//options.addArguments("--lang=en");   browser open in english laungage (this is for chrome)
		//options.addArguments("--lang=fr");  browser open in french laungage (this is for chrome)
		//options.addArguments("ignore-certificate-errors");  when no ssl certificate is there, then use this line
		//options.setExperimentalOption("useAutomationExtension", false); // to remove bar on google page --"Chrome is being control by automated test software 
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation")); // to remove bar on google page --"Chrome is being control by automated test software
					
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.gecko.driver", "lib/winGeckodriver.exe");
		driver= new FirefoxDriver(options);
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.quit();
	}

}

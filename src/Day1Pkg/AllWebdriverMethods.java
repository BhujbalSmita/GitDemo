package Day1Pkg;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebdriverMethods {

	private static Dimension dimension;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "lib/winchromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();//window interface methods
		Thread.sleep(2000);
		driver.manage().window().maximize(); //window interface methods
		Thread.sleep(2000);
		Point point = new Point(100, 100);
		driver.manage().window().setPosition(point); //location of ur window
		Thread.sleep(2000);
		Dimension dimension = new Dimension(200, 200);
		driver.manage().window().setSize(dimension);
		Point position = driver.manage().window().getPosition();
		System.out.println("Current window position : " + position.x +", " + position.y);  //x and y are the properties and not methods
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size of Current Window: " +size.getHeight() +", "+size.getWidth());
		Thread.sleep(2000);
		System.out.println("Current url :" + driver.getCurrentUrl());
		System.out.println("Get Title:" +driver.getTitle());
		//System.out.println("page source is \n\n" + driver.getPageSource());
		driver.quit();

	}

}

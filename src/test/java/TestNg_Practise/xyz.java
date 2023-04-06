package TestNg_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz {

	public static void main(String[] args) throws Throwable {
		
		

//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Path abv = WebDriverManager.edgedriver().getInstance().getBrowserPath().get();
	//////WebDriver driver = new EdgeDriver();
	//System.out.println(abv);
	//driver.get("http://google.com");
	//driver.quit();
		
	
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	driver.quit();
//System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Downloads\\edgedriver_arm64");
	//	WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		//driver.get("https://www.flipkart.com/");
	}
}

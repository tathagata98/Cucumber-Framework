package Stepsinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class common_steps {
	public WebDriver driver;

	/*Ordering is same like the TESTNG ordering except here if it's mentioned 0 for 
	"After tag" that means it
	receives the highest priority and it will execute last
	*/
	
	@Before(order=0)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("The global before hook");

	}

	@After(order=1)
	public void teardown() 
	{
		System.out.println("The global after hook");

		driver.quit();
		
	}

	public WebDriver driver() 
	{
		return driver;
	}

}

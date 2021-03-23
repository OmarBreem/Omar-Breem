package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver;


	@BeforeMethod
	public void startdriver()
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	@AfterMethod
	public void stopdriver()
	{
	driver.quit();

	}
}

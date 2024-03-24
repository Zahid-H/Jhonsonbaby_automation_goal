package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public void setUp() throws IOException {
		
		if(driver==null) {
			FileReader fr = new FileReader("C:\\\\Users\\\\Zahid\\\\eclipse-workspace\\\\project_jbaby_selenium_automation_goal\\\\src\\\\main\\\\resources\\\\configfiles\\\\config.properties");
		    prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriver driver = new ChromeDriver();//base
			driver.get(prop.getProperty("testurl"));//properties
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriver driver = new FirefoxDriver();//base
			driver.get(prop.getProperty("testurl"));//properties
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriver driver = new EdgeDriver();//base
			driver.get(prop.getProperty("testurl"));//properties
		}	
		
	}
	@AfterTest
    public void CloseBrowser() {
		driver.close();
		System.out.println("Browser closed successfully");
		
	}
	
	
	
}

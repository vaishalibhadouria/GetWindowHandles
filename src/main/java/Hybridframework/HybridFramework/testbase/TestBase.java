package Hybridframework.HybridFramework.testbase;

import java.util.jar.Manifest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
public void getBrowser(String browser)
{
	WebDriver driver;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(System.getProperty("user.dir"));
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		
		
}
public static void main(String[] args)
{
	TestBase test =new TestBase();
	test.getBrowser("chrome");
}

}

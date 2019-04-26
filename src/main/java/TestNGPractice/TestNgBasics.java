package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNgBasics 
{
	WebDriver driver;
	
	@Test
	public void abc()
	{    /*driver=new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/MySeleniumLearning/HybridFramework/Driver/chromedriver.exe");
		System.out.println("first");
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("not match", "Google", title);*/
		System.out.println("webdriver not working");
		
	}
	
	@Test(dependsOnMethods="abc")
	public void xyz()
	{
		System.out.println("second");
	}
	@Test(priority=3)
	public void cde()
	{
		System.out.println("third");
	}
	@BeforeClass
	public void inclass()
	{
		System.out.println("in class");
	}
	

	
	}


package TestNGPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;

public class Assertions 
{
WebDriver driver;

public void mera()
{
	driver=new ChromeDriver(); 
	System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_2.46/chromedriver.exe");
	System.out.println("first");
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("not match", "Google", title);
	
	System.out.println("just like that");
}
}

package Hybridframework.HybridFramework.testbase;

import java.util.concurrent.TimeUnit;
import java.util.jar.Manifest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
public void getBrowser(String browser) throws InterruptedException
{
	WebDriver driver;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println(System.getProperty("user.dir"));
			/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
		    Thread.sleep(1000);
			alert.accept();*/
			driver.get("https://html.com/input-type-file/");
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200","");
			driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:/Users/hp/Download/VaishaliSinghCV.docx");
			System.out.println("finish");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		
		
}
public static void main(String[] args) throws InterruptedException
{
	TestBase test =new TestBase();
	test.getBrowser("chrome");
}

}

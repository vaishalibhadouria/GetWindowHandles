package Hybridframework.HybridFramework.OtherPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificSearch {

	
	
	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver","C:/Users/hp/MySeleniumLearning/HybridFramework/Driver/chromedriver.exe" );
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
    List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//child::span"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,150)", "");
    
     
    System.out.println("total options are"+list.size());
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(list.get(i).getText());
    	if(list.get(i).getText().contains("testing tutorials"))
    	{
    		list.get(i).click();
    		System.out.println("clicked" +list.get(i).getText());
    		break;
    	}
    	
    }
    System.out.println("done");
     
	}

}

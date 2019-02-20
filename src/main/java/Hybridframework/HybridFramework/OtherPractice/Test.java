package Hybridframework.HybridFramework.OtherPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	WebDriver driver;
	public void fun() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get("https://www.spicejet.com/Default.aspx");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'MENU')]"))).build().perform();
		System.out.println("mouse hover first");
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//li[@class='hide-mobile']//child::a[contains(text(),'Travel Info')]//span[1][@class='rightarrowclass']"))).build().perform();
		System.out.println("mouse hover second");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='hide-mobile']//ul[@id='menu-list-login']//li[4]/a")).click();
		System.out.println("mouse hover clicked last");
	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Test obj=new Test();
		obj.fun();
		
	}

}

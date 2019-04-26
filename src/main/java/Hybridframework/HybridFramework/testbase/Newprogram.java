package Hybridframework.HybridFramework.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Newprogram {
	WebDriver driver;
	public void test() throws InterruptedException
	{
		
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
			driver=new ChromeDriver(); 
			System.out.println("first");
			
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Newprogram ab= new Newprogram();
		ab.test();

	}

}

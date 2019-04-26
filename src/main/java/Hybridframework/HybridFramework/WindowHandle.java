package Hybridframework.HybridFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class WindowHandle 
{
WebDriver driver;
	public void handle()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		driver.get("https://support.google.com/accounts/answer/27441?hl=en");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/article/section/div/p[1]/a")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String parent = itr.next();
		while(itr.hasNext())
		{
		String child = itr.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		}
		driver.switchTo().window(parent);
	}
	
    public static void main( String[] args )
    {
    	WindowHandle ob=new WindowHandle();
    	ob.handle();
    	System.out.println("completed");
    	System.out.println("user.dir");
    }
}

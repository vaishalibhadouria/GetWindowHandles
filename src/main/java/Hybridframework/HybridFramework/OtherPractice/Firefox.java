package Hybridframework.HybridFramework.OtherPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args)
	{
		//launch firefox
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/hp/MySeleniumLearning/HybridFramework/Driver/geckodriver.exe");
		System.out.println("firefox launched successsfully");
	}

}

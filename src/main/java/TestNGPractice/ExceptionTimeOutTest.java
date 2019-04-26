package TestNGPractice;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest 
{
@Test(expectedExceptions=ArithmeticException.class)
public void functin()
{   System.out.println("exception");
	int a=8/0;
	
}
}

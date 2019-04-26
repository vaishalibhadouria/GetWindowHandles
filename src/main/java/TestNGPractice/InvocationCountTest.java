package TestNGPractice;

import org.testng.annotations.Test;

public class InvocationCountTest 
{
@Test(invocationCount=6)
public void nnn()
{
	System.out.println("invocations");
}
}

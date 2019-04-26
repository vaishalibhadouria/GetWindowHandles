package Hybridframework.HybridFramework.OtherPractice;

public class Testing 
{  
	
	public static void main(String[] args) 
	{
		
		try
		{
			int a=args.length;
			System.out.println("a is "+a);
			int b=42/a;
			try
			{
				int c[]={1};
				c[66]=89;
				
			}
			
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("inside inner try");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("outer try");
	
		}
		System.out.println("completed");
	}

}

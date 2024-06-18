package exception1;

public class ExcHanArray 
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		try 
		{
			m1();
		}
		 catch (Exception e) 
		{
			System.out.println("you can access of array at index 4  only");
			
		}
		
		
	}
	public static void m1()throws ArrayIndexOutOfBoundsException
	    {
	       int arr[]= {1,2,3,4};
	       System.out.println(arr[5]);
	       System.out.println("Exceptiion declear");
		 } 
	}



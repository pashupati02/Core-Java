package exception1;

public class ExcHanArith 
{

	
	public static void demo()throws ArithmeticException
	{
		
	System.out.println("Exception occur in demo Method");
	System.out.println(10/0);
}
	public static void main(String[] args)
	{
	       
	    try {
	    	   demo();
			   
			      }
			 catch (Exception E)
			 {
				 System.out.println("Number Divided by zero");
				 System.out.println(10/2);
			 }
	       finally
	       {
	    	   System.out.println("This is finally Keyword");
	    	   System.out.println("Sucessfull Executed");
	       }
	}
	    

} 

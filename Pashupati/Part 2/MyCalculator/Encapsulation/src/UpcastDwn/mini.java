package UpcastDwn;

public class mini extends Cab
{
	double price = 350;
	  public static void main (String[] args)
	{
	 
	  System.out.println("This is mini class");
	  Cab mcr = new Cab(); // upcasting
	  System.out.println(mcr.cabs);
	  //System.out.println(mcr.price);

	 mini c = (mini) mcr;
	System.out.println(c.price);
	System.out.println(c.cabs);
	}

}

package Questns;

public class CrtCons
{
	int intgr;
	float floats;
 public static void main(String[] args)
 {
	 CrtCons a1= new CrtCons (4,5.6f);
	 //System.out.println(a1) ; // shows object reference
	a1.display();
	 
 }
 
 public CrtCons(int a, float b)
 {
	intgr = a;
	floats =b;
	
 }
  void display ()
  {
	  System.out.println(intgr + " " +floats) ; 
  }
 
}

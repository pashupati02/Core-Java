package Questns;

public class Testques {
	 static int intgr;
	static float floats;
 public static void main(String[] args)
 {
	 CrtCons a1= new CrtCons (4,5.6f);
	 System.out.println(a1) ; // shows object reference
	//a1.display();
	 
 }
 
  public Testques(int a, float b)
 {
	intgr = a;
	floats =b;
	System.out.println("this is int " +a +"this is float " +b );
	//System.out.println(b);
	
	
 }
  /*void display ()
  {
	  System.out.println(intgr + " " +floats) ; 
  }
*/

}

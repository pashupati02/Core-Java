package Questns;

public class CrtCns {
	boolean bool;
	float floats;
	double doubl;
 public static void main(String[] args)
 {
	 CrtCns a1= new CrtCns (true,5.6f,5.699d);
	 //System.out.println(a1) ; // shows object reference
	   a1.display();
	 
 }
 
   CrtCns(boolean b, float f ,double d)
 {
	bool = b;
	floats = f;
	doubl = d;
	
 }

void display ()
  {
	  System.out.println(bool + " " +floats + " "+doubl) ; 
  }

}

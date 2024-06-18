package Questns;

public class CrtCiifd {
	int inta , intb;
	float floats;
	double doubl;
 public static void main(String[] args)
 {
	 CrtCiifd a1= new CrtCiifd (9, 6, 5.6f,5.699d);
	 //System.out.println(a1) ; // shows object reference
	   a1.display();
	 
 }
 
 CrtCiifd(int a,int b, float f ,double d)
 {
	inta =a;
	intb =b;
	floats = f;
	doubl = d;
	
 }

void display ()
  {
	  System.out.println(inta + " " +intb +" " +floats + " "+doubl) ; 
  }

}

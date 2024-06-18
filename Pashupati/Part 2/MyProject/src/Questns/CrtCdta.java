package Questns;

public class CrtCdta {
	static int inta ;
	long lng;
	float floats;
	double doubl;
	char chh;
	String str;
 public static void main(String[] args)
 {
	 CrtCdta a1= new CrtCdta(9, 6888l, 5.6f,5.699d,'A', "Pashupati");
	 //System.out.println(a1) ; // shows object reference
	   a1.display();
	 
 }
 
 CrtCdta(int a,long l, float f ,double d, char c, String s)
 {
	inta =a;
	lng =l;
	floats = f;
	doubl = d;
	chh = c;
	str = s;
	System.out.println("inta = "+ inta);
	
	
}

void display ()
  {
	  System.out.println(inta + " " +lng +" " +floats + " "+doubl+" "+chh+" "+str) ; 
  }

}

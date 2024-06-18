package vector;

import java.util.Vector;

public class VectorHetro {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Randhir");
		v.add(12);
		v.add(true);
	  	v.add(78);
	  	v.add(7.6);
	  	v.add(null);
	  	v.add(null);
	  	v.add(true);
	  	v.add(12);
	  	   	
	  	   for (Object k : v)
	  	   {
				
				System.out.println(k);
	  	   }
	  	   
		}
		
	}

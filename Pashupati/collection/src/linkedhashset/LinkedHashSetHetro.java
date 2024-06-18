package linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetHetro {

	public static void main(String[] args) {
		 LinkedHashSet a =new LinkedHashSet();
	       
  	   a.add("pashupati");
  	   a.add(78);
  	   a.add(7.6);
  	   a.add(true);
  	   a.add("78000");
  	   a.add(7.6);
  	   a.add(null);
  	   a.add(null);
  	   a.add(true);
  	   	
  	   for (Object L : a)
  	   {
			
			System.out.println(L);
  	   }
  	   
	}

}

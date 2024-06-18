package treeSet;

import java.util.TreeSet;

public class TreeSetHetro {

	public static void main(String[] args) {
		 TreeSet a =new TreeSet();
	       
  	   a.add("pashupati");
  	   a.add(78);
  	   a.add(7.6);
  	   a.add(true);
  	   a.add("78000");
  	   a.add(7.6);
  	   a.add(null);
  	   a.add(null);
  	   a.add(true);
  	   	
  	   for (Object T : a)
  	   {
			
			System.out.println(T);
  	   }
  	   

	}

}

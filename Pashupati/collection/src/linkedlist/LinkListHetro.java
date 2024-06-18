package linkedlist;

import java.util.LinkedList;

public class LinkListHetro {

	public static void main(String[] args) {
		 LinkedList a1 =new LinkedList();
	       
  	   a1.add("Pashupati Kumar");
  	   a1.add(78);
  	   a1.add(7.6);
  	   a1.add(true);
  	   a1.add(78);
  	   a1.add(7.6);
  	   a1.add(null);
  	   a1.add(null);
  	   a1.add(true);
  	   	
  	   for (Object p : a1)
  	   {
			
			System.out.println(p);
  	   }
  	   
	}
	}



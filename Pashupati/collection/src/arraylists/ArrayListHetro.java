package arraylists;

import java.util.ArrayList;

public class ArrayListHetro {

	
	public static void main(String[] args) {
		
       ArrayList a =new ArrayList();
       
    	   a.add("pashupati");
    	   a.add(78);
    	   a.add(7.6);
    	   a.add(true);
    	   a.add("78000");
    	   a.add(7.6);
    	   a.add(null);
    	   a.add(null);
    	   a.add(true);
    	   	
    	   for (Object p : a)
    	   {
			
			System.out.println(p);
    	   }
    	   
       
	}

}

package hashset;

import java.util.HashSet;

public class HashSetHetro {

	public static void main(String[] args) {
		
//		In vectors dont take copy 
		HashSet h = new HashSet();
		h.add("Dhiru");
		h.add("pashu"); 
		h.add("Java Collection");
		h.add(true);
		h.add(67);
		h.add(67);
		h.add(true);
		h.add(null);
		h.add(null);
		
		for(Object M :h) 
		{
		
		System.out.println(M);

	    }
	}
}



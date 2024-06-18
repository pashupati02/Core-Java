package maps;

import java.util.Hashtable;

public class HashtableHomo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable <Integer,Integer> M = new Hashtable(); 
        M.put(1,8);
        M.put(2,9);
        M.put(3,9);
        M.put(4,8);
        M.put(5,9);
        M.put(6,9);
        M.put(7,8);
        M.put(8,9);
        M.put(9,9);
        M.clear(); // To clear all the entries
        
       System.out.println(M);	
       }
       
	
}

package Inheritance;

public class CauliFlower extends Vegetable {

	double price =40;
	public static void main(String[] args) 
	{
		
		System.out.println("hy");
		Vegetable veg = new CauliFlower(); //upcasting create parent type variable
		System.out.println(veg.origin);
		//System.out.println(m.price); // Can't access child properties by parent variable
		
		//Downcasting
		CauliFlower n =(CauliFlower) veg;
		System.out.println(n.origin);
		System.out.println(n.price);
		//advantage of inheritance generalization specialization
		//class cast exception (run time )-
	}

	
}

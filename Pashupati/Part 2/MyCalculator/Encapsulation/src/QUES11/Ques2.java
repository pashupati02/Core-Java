package QUES11;



	class Parent {
	    void printData() {
	        System.out.println("Method of parent class");
	    }
	}

	class Child extends Parent {
		int r = 45;
	    void printData()
	    {
	        System.out.println("Method of child class");
	    }
	}

	public class Ques2 {
	    public static void main(String[] args) {
	        Parent obj1 = (Parent) new Child();
	        Parent obj2 = (Parent) new Child();

	        obj1.printData(); // Output: "Method of child class"
	        obj2.printData(); // Output: "Method of child class"
	        // By the help of method overriding we can access the child class members.
	        Parent invalidObj = new Parent();// ClassCastException
	        Parent invalidObj2 = new Child();
	        
	        Child invalidChildObj = (Child) invalidObj;
	        System.out.println(invalidChildObj);
	        
	        Child invalidChildObj2 = (Child) invalidObj2 ;
	        System.out.println(invalidChildObj2);
	        
	        
	    }
	}



package QUES11;



 class Upcst 
{
    String m =("Pashupati");
    void kumar()
    {
    	System.out.println("This is parent class" );    
    }
}

  class UpcsC extends Upcst
  {
	  int k =34;
	  void pashupati()
	  {
		  System.out.println("This is child class");
	  }
  }
  
  class Dfinal
  {

	public static void main(String[] args) 
	  {
		Upcst a = new UpcsC();
		a.kumar();
		System.out.println(a.m);
		//System.out.println(a.k);
		//((UpcsC) a).pashupati();
		
	  }
  }
  

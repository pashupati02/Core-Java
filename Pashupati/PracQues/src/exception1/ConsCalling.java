package exception1;

public class ConsCalling 
{
   String name;
   int roll;
	
	ConsCalling()
	{
		System.out.println("This IS no Para");
		
	}
	ConsCalling(String name)
	{
		this();
		this.name =name;
		System.out.println(name);
	}
	ConsCalling( String name ,int roll)
	{    
		this(name);
		this.name=name;
		this.roll =roll;
		System.out.println(name+" "+roll);
	}
	public static void main(String[] args) 
	{
		ConsCalling c1 =new ConsCalling("Pashupati" , 2007546); 
	}

}

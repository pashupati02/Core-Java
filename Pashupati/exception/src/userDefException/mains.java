package userDefException;

class Geek
{
	int num =100;
	String name ="Pashupati";
	Geek()
	{
		System.out.println("Constructor is created");
	}
}
public class mains
{
	public static void main(String [] args)
	{
		Geek g1 =new Geek();
		System.out.println(g1.name);
		System.out.println(g1.num);
		
	}
}
package quest;

public class ConsOver {

	public static void main(String[] args) 
	{
		System.out.println("Constructor overloading");
//		ConsOver e1 =new ConsOver();
		ConsOver e2 =new ConsOver(5);

	}
	ConsOver()
	{
		System.out.println("No ARgument constuctor");
	}
	ConsOver(int a)
	{
		this();
		int b =9;
		int sum =a+b;
		System.out.println(sum);
	}
	
}

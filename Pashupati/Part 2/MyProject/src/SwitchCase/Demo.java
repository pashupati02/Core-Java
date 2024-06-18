package SwitchCase;
import java.util.Scanner;

public class Demo {
	@SuppressWarnings("resource")
	
	public static void main(String[] args)
	{
		
		
		System.out.println("WELCOME TO MY PROGRAM");
		System.out.println();
		System.out.println("Enter Your Number");
		System.out.println();
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division ");
		System.out.println("5 for Other Operations. 1 Count the digit  2 Square  3 Cube   4 Factorial  5 Factor  6 Power ");
		System.out.println("6 for Exit ");
		
		Scanner myobj = new Scanner(System.in);
		int num = myobj.nextInt();
		
		switch (num)
		{
		case 1:
		{
			System.out.println("Enter two number for addition");
			int num1 = myobj.nextInt();
			int num2 = myobj.nextInt();
			System.out.println("The Addition of numbers  "  +(num1+num2));
			break;
		}
		case 2:
		{
			System.out.println("Enter two number for Substraction");
			int num1 = myobj.nextInt();
			int num2 = myobj.nextInt();
			System.out.println("The Substraction of numbers "  +(num1-num2));
			break;
		}
		case 4:
		{
			System.out.println("Enter two number for Division");
			int num1 = myobj.nextInt();
			int num2 = myobj.nextInt();
			System.out.println("The Division of numbers "  +(num1/num2));
			break;
		}
		case 3:
		{
			System.out.println("Enter two number for Multiplication");
			int num1 = myobj.nextInt();
			int num2 = myobj.nextInt();
			System.out.println("The Multiplication  of numbers "  +(num1*num2));
			break;
		}
		case 5:
		{
			System.out.println("Other Operations");
			int num4 = myobj.nextInt();
			switch(num4)
			{
			case 1:
			{
				System.out.println("Enter number for count digit");
				int num1 = myobj.nextInt();
				
				int i = 0;
			      int sum = 0;
			      while (num1 != 0) 
			      {
			         int digit = num1 % 10;
			         sum = sum + digit;
			         i++;
			         num1 = num1 / 10;
			      }
			      System.out.println(i);
				
			}
			}
			
			
		}
		
	}
	
	}

}

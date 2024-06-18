package operation;

public class DigCount {

	public static void main(String[] args) {
		counts(451);

	}
public static void counts(int a)
{
	int c =0;
	int sum = 0;
    while (a != 0) {
       int digit = a % 10;
       sum = sum + digit;
       c++;
       a = a / 10;
       

    }
    System.out.println("The no of digits is " +c);
		
	}
}

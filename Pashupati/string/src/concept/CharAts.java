package concept;
import java.util.Scanner;


public class CharAts {

	public static void main(String[] args) 
	{
       Scanner myobj = new Scanner(System.in);
       System.out.println("Enter your Character");
       char aem = myobj.next().charAt(0);
       System.out.println(aem);
	}

}

package exception1;
import java.util.*;
public class ArrayMinMax {

	public static void main(String[] args) 
	{
		int arr[] = {23,45,65,43,56};
		
//		Inbuilt function of sort Array
		Arrays.sort(arr);
		
		System.out.println("min-"+arr[0]+"max-"+arr[arr.length-1]);
	}

	

}

package array_Ques2;

public class PrtEvenIndex {

	public static void main(String[] args) 
	{
		int arr[] = {12,5,45,87,4,98,66};
		for(int i=0; i<arr.length;i++)
		{
			if(i%2 ==0 && i!=0)
			{
				System.out.println("The even no of elments of array is ");
				System.out.println(arr[i]);
			}
		}

	}

}

package array_Ques2;

public class PrtEvenArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {6,4,2,6,9,8};
		System.out.println("the refrence of array is "+arr);
		for(int i =0; i<arr.length;i++)
		{
			if((arr[i]%2)==0)
			{
			//System.out.println("These are even elements in array" ); 
			System.out.println(arr[i]);
			}
			
		}
	}

}

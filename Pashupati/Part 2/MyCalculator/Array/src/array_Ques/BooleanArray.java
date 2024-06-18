 package array_Ques;

public class BooleanArray {

	public static void main(String[] args) {
		boolean arr[] = {true,true,false,true,false,true};
		System.out.println("Boolean Type array is creatyed with the length of " +arr.length);
		//boolean arr1 []= new boolean[6];
		
		//System.out.println("Reference of array is created: " +arr1);
		System.out.println("Reference of char array is created: " +arr);

		System.out.println("index of [0] element is " +arr[0]);
		System.out.println("index of [1] element is " +arr[1]);
		System.out.println("index of [2] element is " +arr[2]);
		System.out.println("index of [3] element is " +arr[3]);
		System.out.println("index of [4] element is " +arr[4]);
		System.out.println("index of [5] element is " +arr[5]);
		
		
		System.out.println("Printing elements of boolean array using for loop");
		
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println(" element of array is " +arr[i]);
		}
		
		System.out.println("Acess of char array elements from reverse");
		
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.println(" element of boolean array is " +arr[i]);
		}
		
		System.out.println(" Access elements of array using while loop ");
		
		int j =0;
		
		while(j<=arr.length-1)
		{
			System.out.println(arr[j]);
			j++;
		}
		int k=0;
     do {
			
			System.out.println(arr[k]);
			
			k++;
		}
		while(k<arr.length);
		System.out.println("Acess of do while loop is created sucessful ");
	}

}

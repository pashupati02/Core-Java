package array_Ques;

public class LongArray {

	public static void main(String[] args) 
	{
		 long arr [] = {96000,780000,75000,98000,1464054,75000}; //Create array & store elements in array
		    System.out.println("Long type array is created");
		    
			System.out.println("Refrence variable of array " +arr);
			
			System.out.println("length of Long array is " +arr.length);// array name with . length shows length of an array
			System.out.println("index of [0] element is " +arr[0]);
			System.out.println("index of [1] element is " +arr[1]);
			System.out.println("index of [2] element is " +arr[2]);
			System.out.println("index of [3] element is " +arr[3]);
			System.out.println("index of [4] element is " +arr[4]);
			System.out.println("index of [5] element is " +arr[5]);
			
			System.out.println("Printing elements of long array using for loop");
			
			for(int i =0;i<=arr.length-1;i++)
			{
				System.out.println(" element of array is " +arr[i]);
			}
			
			System.out.println("Acess of array elements from reverse");
			
			for(int i =arr.length-1;i>=0;i--)
			{
				System.out.println(" element of int array is " +arr[i]);
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

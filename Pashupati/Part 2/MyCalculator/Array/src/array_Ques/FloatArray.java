package array_Ques;

public class FloatArray 
{
	public static void main(String[] args) 
	{
		 // while inserting float elements in array we must declare values with f
		 float arr [] = {11.04f,7.80f,11.04f,14.64f,11.04f}; //Create array & store elements in array
		    System.out.println("Float type array is created");
		    
			System.out.println("Refrence variable of array " +arr);
			
			System.out.println("length of Float array is " +arr.length);// array name with . length shows length of an array
			System.out.println("index of [0] element is " +arr[0]);
			System.out.println("index of [1] element is " +arr[1]);
			System.out.println("index of [2] element is " +arr[2]);
			System.out.println("index of [3] element is " +arr[3]);
			System.out.println("index of [4] element is " +arr[4]);
			
			
			System.out.println("Printing elements of float array using for loop");
			
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

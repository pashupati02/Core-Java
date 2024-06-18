package array_Ques;

public class DoubleArray {

	public static void main(String[] args) 
	{
		// while inserting double elements in array we must declare values with nothing
		/*Comparison:
Accuracy: Double is more accurate than float.

Precision: Double follows double-precision,
           while float follows single-precision.
           
Range: Double can represent much larger numbers than float.

Use Case: Use float when memory efficiency is crucial,
          and double when higher precision is required.*/
				 double arr [] = {11.048,7.808,11.048,14.648,11.048}; //Create array & store elements in array.
				    System.out.println("Double type array is created");
				    double arr1 [] = new double[5];
					System.out.println("Refrence variable of array " +arr1);
					
					System.out.println("length of Double array is " +arr.length);// array name with . length shows length of an array
					System.out.println("index of [0] element is " +arr[0]);
					System.out.println("index of [1] element is " +arr[1]);
					System.out.println("index of [2] element is " +arr[2]);
					System.out.println("index of [3] element is " +arr[3]);
					System.out.println("index of [4] element is " +arr[4]);
					
					
					System.out.println("Printing elements of Double array using for loop");
					
					for(int i =0;i<=arr.length-1;i++)
					{
						System.out.println(" element of array is " +arr[i]);
					}
					
					System.out.println("Acess of array elements from reverse");
					
					for(int i =arr.length-1;i>=0;i--)
					{
						System.out.println(" element of double array is " +arr[i]);
					}
					
					System.out.println(" Access elements of array using while loop ");
					int j =0;
					while(j<=arr.length-1)
					{
						System.out.println(arr[j]);
						j++;
					}

	}

}

package exception1;

public class ReverseArrayExtraArray 
{
	 public static void reverseArrayExtraArray(int[] arr)
	    {
	        int[] reversedArr = new int[arr.length]; 
	        for (int i = 0; i < arr.length; i++) {
	            reversedArr[i] = arr[arr.length - i - 1];
             //System.out.println(reversedArr[i]);
	            
	        }

	        // Print reversed array
	        System.out.print("Reversed Array: ");
	        for (int i : reversedArr) {
	            System.out.print(i + " ");
	        }
	    }

	    public static void main(String[] args)
	    {
	        int[] originalArr = { 1, 2, 3, 4, 5 };
	        reverseArrayExtraArray(originalArr);
	    }
	}


 
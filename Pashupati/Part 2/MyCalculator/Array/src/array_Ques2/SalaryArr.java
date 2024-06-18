package array_Ques2;

public class SalaryArr {
	int sal;

	public  SalaryArr( int sal) 
	{
		this.sal= sal;
	}


	public void printDetails() 
	{
		System.out.println("salary : "+this.sal);
		
	}
	public static void main(String[] args) 
	{
		
		SalaryArr [] arr =  new SalaryArr[5];
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]); 
		System.out.println(arr[4]); 
		
		System.out.println();
	    arr[0] = new SalaryArr(200);
	    arr[1] = new SalaryArr(25000);
	    arr[2] = new SalaryArr(4591);
	    arr[3] = new SalaryArr(91234);
	    arr[4] = new SalaryArr(784514);
	   
		for (int i = 0; i < arr.length; i++)
		{
			 arr[i].printDetails();
			 System.out.println();
		}
		for(int i = arr.length-1;i>=0;i--)
		{
			arr[i].printDetails();
			System.out.println();
		}
		
		int i =0;
		while(i<arr.length)
		{
			arr[i].printDetails();
			i++;
		}
		
	    int k = 0;
		do {
			
			
			arr[k].printDetails();
			k++;
		}
		while(k<arr.length);
		System.out.println("Acess of do while loop is created sucessful ");
}
}

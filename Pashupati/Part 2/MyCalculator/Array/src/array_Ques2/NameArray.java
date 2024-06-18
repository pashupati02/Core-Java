package array_Ques2;

public class NameArray
{
	  String name;
    
	public NameArray(String name) 
	{
		this.name=name;
	}
	

	public void printDetails() 
	{
		System.out.println("name : "+this.name);
		
	}
	public static void main(String[] args) 
	{
		 
		NameArray [] arr =  new NameArray[8];
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]); 
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		System.out.println();
	    arr[0] = new NameArray("Pashupati");
	    arr[1] = new NameArray("Dhiru");
	    arr[2] = new NameArray("Pashupati Raj");
	    arr[3] = new NameArray("Das");
	    arr[4] = new NameArray("Pashubpati");
	    arr[5] = new NameArray("Pashu pati");
	    arr[6] = new NameArray("Pashupati Kumar");
	    arr[7] = new NameArray("raghupati");
	    arr[8] = new NameArray("pati");
	    arr[9] = new NameArray("Prahupati");
        
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
		while(i<8)
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

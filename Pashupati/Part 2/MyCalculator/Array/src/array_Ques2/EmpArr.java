package array_Ques2;

public class EmpArr {
	  String name;
       int eid;
   public EmpArr(String name) 
	{
		this.name=name;
	}
	public EmpArr( int eid) 
	{
		this.eid=eid;
	}
	public EmpArr(String name, int eid) 
	{
		this(name);// constructor calling statement
		this.eid=eid;
	}

	public void printDetails() 
	{
		System.out.println("eid : "+this.eid );
		System.out.println("name : "+this.name );
		
	}
	public static void main(String[] args) 
	{
		
		EmpArr [] batch =  new EmpArr[5];
		System.out.println(batch);
		System.out.println(batch.length);
		System.out.println(batch[0]);
		System.out.println(batch[1]);
		System.out.println(batch[2]);
		System.out.println(batch[3]); 
		System.out.println(batch[4]);
		
		System.out.println();
	    batch[0] = new EmpArr("pashu",2007546);
        batch[1] = new EmpArr("das",2007547);
        batch[2] = new EmpArr("Ragupati",2007548);
        batch[3] = new EmpArr("pashupati",2007549);
        batch[4] = new EmpArr("dhiru",200756);
        
       
		for (int i = 0; i < batch.length; i++)
		{
			 batch[i].printDetails();
			 System.out.println();
		}
		for(int i = batch.length-1;i>=0;i--)
		{
			batch[i].printDetails();
			System.out.println();
		}
		
		int i =0;
		while(i<5)
		{
			batch[i].printDetails();
			i++;
		}
		
	    int k = 0;
		do {
			
			
			batch[k].printDetails();
			k++;
		}
		while(k<batch.length);
		System.out.println("Acess of do while loop is created sucessful ");
}
}

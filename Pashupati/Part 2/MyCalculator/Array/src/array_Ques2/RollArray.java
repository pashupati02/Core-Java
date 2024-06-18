package array_Ques2;



public class RollArray 
{
	
	    //String name;
	    int roll;
//		public RollArray(String name) 
//		{
//			this.name=name;
//		}
		public RollArray ( int roll) 
		{
			this.roll=roll;
		}
//		public RollArray (String name, int id) 
//		{
//			this(name);
//			this.id=id;
//		}

		public void printDetails() 
		{
			System.out.println("roll : "+this.roll);
			
		}
		public static void main(String[] args) 
		{
			
			RollArray [] batch =  new RollArray[8];
			System.out.println(batch);
			System.out.println(batch.length);
			System.out.println(batch[0]);
			System.out.println(batch[1]);
			System.out.println(batch[2]);
			System.out.println(batch[3]); 
			System.out.println(batch[4]);
			System.out.println(batch[5]);
			System.out.println(batch[6]);
			System.out.println(batch[7]);
			System.out.println();
		    batch[0] = new RollArray(2007546);
	        batch[1] = new RollArray(2007547);
	        batch[2] = new RollArray(2007548);
	        batch[3] = new RollArray(2007549);
	        batch[4] = new RollArray(2007560);
	        batch[5] = new RollArray(5641313);
	        batch[6] = new RollArray(7791100);     
	        batch[7] = new RollArray(8004567);
	       
			for (int i = 0; i < 8; i++)
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
			while(i<8)
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

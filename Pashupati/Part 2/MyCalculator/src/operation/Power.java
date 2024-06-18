package operation;

public class Power {

	public static void main(String[] args)
    {
    
     power(3,3);

    }
   public static void power(int b , int p)
    {
      int ans = b;
      for(int i=1;i<=(p-1);i++)
      {
        ans*=ans;
      }
      System.out.println(ans);

     }
}

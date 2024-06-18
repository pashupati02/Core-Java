class PriPwr
{
   public static void main(String[] args)
    {
    
     power(3,3);
     power(2,2);
     power(1,1);

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
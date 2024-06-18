class Pashpati
{
  public static void main(String [] args)
  {
    factor(4);
  }
  public static void factor(int a)
  {
     for(int i=1;i<=a;i++)
     {
       if(a%i==0)
       {
          //System.out.println(i);
         factorial(i);
       }
     }
  }
  public static void factorial(int a)
  {
    int fact=1;
    for(int i=1;i<=a;i++)
    {
      fact*=i;
    }
    // System.out.println(fact);
     square(fact);
  }
  public static void square(int a)
  {
    int sq=a*a;
    System.out.println(sq);
  }
}

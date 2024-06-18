class Caplo
{
  public static void main(String[] args) {

    chk('A');

  }

  public static void chk(char n)

  {
    if (n >= 65 && n <=90 )
     {
      n = (char) (n+32);
      System.out.println(n);
    }
  }


}
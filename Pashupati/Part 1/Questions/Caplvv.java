class Caplvv
{
  public static void main(String[] args) {

    chk('A');

  }

  public static void chk(char n)

  {
    if (n >= 65 && n <= 90)
     {
      n = (char)(n+32);
      System.out.println(n);
    }
    else if (n >= 97 && n <= 122)
    { 
      n = (char) (n-32);
      System.out.println(n);

     }
else
{
  System.out.println("Invalid Input");

}
  }


}
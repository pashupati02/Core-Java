class CharLow {

  public static void main(String[] args) {

    chk('a');

  }

  public static void chk(char n)

  {
    if (n >= 97 && n <= 122)
    {
      n = (char) (n-32);
      System.out.println(n);
    }
  }
}
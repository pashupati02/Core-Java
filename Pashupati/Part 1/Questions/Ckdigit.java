class Ckdigit {

   public static void main(String[] args) {
      mox(468);
   }

   public static void mox(int num) {
      int i = 0;
      int sum = 0;
      while (num != 0) 
      {
         int digit = num % 10;
         sum = sum + digit;
         i++;
         num = num / 10;
      }
      System.out.println(i);

   }

}
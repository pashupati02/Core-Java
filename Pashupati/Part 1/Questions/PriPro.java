class PriPro {

   public static void main(String[] args) {
      foxy(577);
   }

   public static void foxy(int num) {
      int mux = 1;
      while (num != 0) {
         int digit = num % 10;
         mux = mux * digit;
         num = num / 10;

      }

      System.out.println(mux);

   }

}

class Prisum {

   public static void main(String[] args) {
      foxy(577);
   }

   public static void foxy(int num) {
      int sum = 0;
      while (num != 0) {
         int digit = num % 10;
         sum = sum + digit;
         num = num / 10;

      }

      System.out.println(sum);

   }

}


// class Prisum {

//    public static void main(String[] args) {
//       foxy(577);
//    }

//    public static void foxy(int num) {
//       int sum = 0;
//       int i=0;
//       while (num != 0) {
//          int digit = num % 10;
//          sum = sum + digit;
//          i++;
//          num = num / 10;
         
//       }
//       System.out.println(i);
      
//    }

// }

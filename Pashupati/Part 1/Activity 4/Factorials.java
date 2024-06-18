class Factorials {
    public static void main(String[] args) {
        fact(1, 1);

    }

    public static void fact(int n, int fact) {

        if (n == 0 || n == 1) {
            System.out.println("Factorial of " + n + " is 1");
        } else {
            for (int i = n; i > 0; i--) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}

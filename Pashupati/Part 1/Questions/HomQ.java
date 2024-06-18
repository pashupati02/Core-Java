class HomQ {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                int fact = 1;
                System.out.println("Factor: " + i);
                for (int a = 1; a <= i; a++) {
                    fact *= a;
                }
                System.out.println("Factorial of " + i + ": " + fact);
            }
        }
    }
}
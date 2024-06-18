class Revers {
    public static void main(String[] args)
    {
        int number = 1234, reverse = 0;
        for (; number != 0; number = number / 10)
        {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
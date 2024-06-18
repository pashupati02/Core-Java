class EvnDig {

    public static void main(String[] args) {
        foxy(247);
    }

    public static void foxy(int num) 
    {
        int mux = 0;
        while (num != 0) {
            int digit = num % 10;
            if(digit%2==0 && num!=1)
            {
                mux = mux + digit;
            }
            
            num = num / 10;

        }

        System.out.println(mux);

    }

}

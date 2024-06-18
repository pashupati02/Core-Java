class MetFtr 
{
    public static void main(String[] args) 
{
        foxy(9);
    }

    public static void foxy(int num) 
    {
        for (int i =1;i<=num;i++)
        {
            if (num%i==0)
            {
            System.out.println(i);
            }
    }
    }

}
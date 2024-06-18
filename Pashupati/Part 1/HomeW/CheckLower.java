class CheckLower

{
    public static void main (String [] args)
    {
        char A = 'a';
         int B = (int)A ;
       
        String x =  ((B>96) && (B<122))? "Lower Character":"Not Lower Character";
        System.out.println("This is a " +x );
    }
}
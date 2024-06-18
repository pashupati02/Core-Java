class CheckChar
{
    public static void main (String [] args)
    {
        char a= 'A';
int c = (int)a ;

        String x =  ((c>64) && (c<90))? "Character":"Non Character";
        System.out.println("This is a " +x );
    }
}
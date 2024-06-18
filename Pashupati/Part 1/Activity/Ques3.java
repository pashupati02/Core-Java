// class Ques3
// {
// public static void main(String[] args)
// {
// int a = 57;
// byte b = (byte) a; // byte
// short c = (short) a; //short
// long d = a; 
// float e = a;
// double f =a;
// char g = (char)a;
// System.out.println( b ); 
// System.out.println( c);
// System.out.println( d );  
// System.out.println( e ); 
// System.out.println( f ); 
// System.out.println( g ); 

// }

// }


// Using Method
class Ques3
{
//private static short c;

@SuppressWarnings("unused")
public static void main(String[] args)
{
    int a =57;
    byte b = (byte) a; // byte
    short c = (short) a; //short
    long d = a; 
    float e = a;
    double f =a;
    char g = (char)a;
    tycst(57,(byte)a,(short)c,a,a,a,(char)a);
}

public static void tycst(int a,byte b,short c,long d,float e,double f,char g)
{
    
    
    System.out.println( a ); 
    System.out.println( b ); 
    System.out.println( c);
    System.out.println( d );  
    System.out.println( e ); 
    System.out.println( f ); 
    System.out.println( g ); 
}

}
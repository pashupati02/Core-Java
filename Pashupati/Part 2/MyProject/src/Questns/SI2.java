package Questns;


class S12
{

static int a = demo()+test();; // 5+

static String var1;

static {
	System.out.println("SMLI1");

	demo();
}

public static void main (String [] args) 
{

System.out.println("Starts of Main");

var1 = "Ram";

demo();

System.out.println(a);

System.out.println("Ends of Main");

}
public static int demo()
{

System.out.println(var1);

return 5;

}
public static int test()
{

System.out.println("I am test");

return 3;

} 
static

{

System.out.println("SML12");
a =1;
}
}
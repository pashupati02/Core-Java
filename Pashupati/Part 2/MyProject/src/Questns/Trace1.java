package Questns;

class Trace1
{

int x;
int z=9;
static int y = 10;

public Trace1()
{
System.out.println("i am constructor ");
System.out.println("Hello World 1");
System.out.println(z);
}
//{
//System.out.println("this is mlni");	
//}
public void m2()
{
System.out.println("m2 i am non static ");


}

public static void main(String []args)
{
System.out.println("Hello World");

m1 ();

System.out.println();


Trace1 t= new Trace1();

System.out.println(t.x);

System.out.println(Trace1.y); 
t.m2();

Trace1 t1 = new Trace1();

System.out.println(t1.x);
System.out.println(Trace1.y);

t1.m2();

t.x=8;
System.out.println(t.x);
System.out.println(t1.x);//8 
System.out.println(t1.x);// 0

y=6;

System.out.println(y); //6 
System.out.println(Trace1.y); //6 
System.out.println(Trace1.y); //6

Trace1.y =4;
System.out.println("Trace1.x");
}
public static void m1() 
{

System.out.println("From m1");

}
}

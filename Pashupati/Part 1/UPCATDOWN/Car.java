public class Car extends Vehicle
{
 double price = 3500;
  public static void main (String[] args)
{
 
  System.out.println("This is cHILD class");
  Vehicle mcr = new Car(); // upcasting
  System.out.println(mcr.vec);
  //System.out.println(mcr.price);

 Car c = (Car) mcr;
System.out.println(c.price);
System.out.println(c.vec);
}


}
class Byte {
  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  public static void main(String[] args) 
  {

    byte num1 = 1;
    byte num2 = 2;
    byte num3 = 2;
    byte num4 = 3;
    // byte num5 = 4;
    System.out.println(num1,num2,num3,num4,num5);
  }

  @Override
  public java.lang.String toString() {
    return "Byte []";
  }
}
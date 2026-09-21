public class Q01_PowerAndSquareRoot
  {
    public static void main (String[] args)
    {
      int base = 2;
      int exponent = 10;
      int number =  81;

      double power = Math.pow(base,exponent);
      double squareRoot = Math.sqrt(number);
       System.out.println( base + " ^ " + exponent + " = " + power);
      System.out.println("Square root of " + number + " = " +  squareRoot);

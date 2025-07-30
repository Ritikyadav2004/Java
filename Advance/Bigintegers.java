import java.util.*;
import java.math.BigInteger;
public class Bigintegers
{
  public static void main(String []args)
  {
    BigInteger a = new BigInteger("123456789");
    BigInteger b = new BigInteger("123456789");
    BigInteger c = a.add(b);
    System.out.println("Addition of two large number :"+c);
    c=a.subtract(b);
    System.out.println("Subtraction of two large number :"+c);
    c=a.multiply(b);
   System.out.println("Multiplication of two large number :"+c);
    c=a.divide(b);
    System.out.println("Division of two large number :"+c);

    String b1 = "10987654321";
    BigInteger d = new BigInteger(b1);
    System.out.println("This is String indirect way:"+d);
    int b2 = 7463;
    BigInteger B2 =   BigInteger.valueOf(b2);   // need not to be declre as new Bigintger
        System.out.println("This is Integer value:"+d);
 // System.out.println(a.compare(b));
  System.out.println(a.remainder(b));

  System.out.println("Finding Factorial of given number  100 :");
int n = 50;
  BigInteger f = new BigInteger("1");//similer to int fact = 1;
  for(int i=2;i<=n;i++)
  {
    BigInteger x  = BigInteger.valueOf(i);//conerting int value to string and add it into big
    f  = f.multiply(x);
  }
  System.out.println("Factorial :"+f);
  
  }
}
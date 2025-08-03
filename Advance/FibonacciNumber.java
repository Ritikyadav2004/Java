import java.math.BigInteger;
public class FibonacciNumber
{
    // An efficient iterative implementation to calculate Fibonacci numbers.
    public static BigInteger fib(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("Input n cannot be negative.");
        }
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }
   public static void main(String [] args)
   {
        int n = 100;
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
   }
}
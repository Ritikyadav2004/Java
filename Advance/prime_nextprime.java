import java.math.BigInteger;

public class prime_nextprime {
    public static boolean isprime(int n)
    {
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);

    }
    public static int isNextPrime(int n)
    {
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt(a);



    }
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.out);

       int n=13;
       System.out.println(n+" is Prime "+isprime(n));
       System.out.println(n+" Next Prime "+isNextPrime(n));
    }
    
}

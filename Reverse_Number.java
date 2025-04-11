import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        int n, rev = 0, rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n!=0)
        {
         rem = n%10;//taking every last digit 
         n/=10;//removing last digit from n
         rev  = rev*10+rem;//adding last digit to rev
        }
        System.out.println(rev);
    }
    
}

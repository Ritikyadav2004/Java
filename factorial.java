import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = s.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);

    }
    
}

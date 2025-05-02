import java.util.Scanner;
public class Even_odd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if(n==0)System.out.println("This Zero Not Categorize");
        else if(n%2==0)System.out.println("This Even numbr:");
        else System.out.println(" This Odd number:");


    }
}
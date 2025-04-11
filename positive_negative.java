import java.util.Scanner;
public class positive_negative
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
         int n = s.nextInt();
         if(n<0)System.out.println("Negative number:");
         else if(n>0)System.out.println("Positive number:");
         else System.out.println("Zero Not Categorize");
    }
}
import java.util.Scanner;
public class Gretest_number {
   public static void main(String[] args)
   {
     Scanner s =new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int n=s.nextInt();
     System.out.println("Enter the second number");
     int m  =s.nextInt();
     if(n<m)System.out.println("The greatest number is: "+m);
     else if(n==m) System.out.println("The numbers are equal: "+n+" and "+m);
     else System.out.println("The greatest number is: "+n);

   }
    
}

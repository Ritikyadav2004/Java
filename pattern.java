
import java.util.Scanner;
public class pattern 
{
    public static void main(String[] args) {
          Scanner s  = new Scanner(System.in);
            System.out.print("Enter A Number:");
            int n = s.nextInt();
        for(int i=n;i>=1;i-- )
        {
          for(int j=i-1;j>=1 ;j--)
          {
            System.out.print(" ");
          }
          for(int k = 1;k<=n-i+1;k++ )
          {
            System.out.print("*");
          }
          System.out.println("");

        }
    }

}

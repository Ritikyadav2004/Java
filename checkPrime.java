import java.util.Scanner;

public class checkPrime
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n = s.nextInt();
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n% i==0)
            {
                 flag = false;
                 break;
            }
            
       }
        if(flag)System.out.println("Prime Number: " + n);
        else System.out.println("Not Prime Number: " + n);
        
        
    }
}
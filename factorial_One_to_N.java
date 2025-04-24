import java.util.*;
public class factorial_One_to_N {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter Number:");
        int n = s.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++)
        {   fact=1;
            for(int j=1;j<=i;j++)
            {
               fact*=j;
            }
            System.out.println(i+"!"+"= "+fact);
        }
    }
}

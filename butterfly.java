public class butterfly {

    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            //for printing lower left trinagle
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            //FOR SPACES 
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("   ");
            }
            //FOR SPACES
            for(int j=2*n-i;j>=n+1;j--)
            {
                System.out.print("   ");//("   ") 3 spaces
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
         for(int i=1;i<=n;i++)
         {
            for(int j=n+1-i;j>=1;j--)
          {
            System.out.print(" * ");
          }
          
          //FOR SPACES
          for(int j=2;j<=i;j++)
          {
            System.out.print("   ");
          }
          for(int j=2;j<=i;j++)
          {
            System.out.print("   ");
          }

        for(int j=n+1-i;j>=1;j--)
        {
            System.out.print(" * ");
        }
       
          System.out.println("");
         } 
    }
}

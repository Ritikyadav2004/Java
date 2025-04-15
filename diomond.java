public class diomond {
    public static void main(String[] args) {
        int n=10;

       int i1=0;
        for(int i=1;i<=n;i++) 
        {
         for(int j=1;j<=n-i;j++)
         {
             System.out.print("   ");
 
         }
         for(int j=1;j<=2*i-1;j++)
         {
             System.out.print(" * ");
         }
         System.out.println();
        }
        for(int i=n;i>=1;i--)
        {  
            i1++;
           for(int j=1;j<=2*i-1;j++)
           {
            System.out.print(" * ");
            //System.out.print("\uD83D\uDE00");
           }
           System.out.println();
           for(int k=1;k<=i1;k++)
           {
            System.out.print("   ");
           }
        }
    }
    
}

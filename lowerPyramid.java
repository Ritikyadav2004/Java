public class lowerPyramid {
    public static void main(String[] args) {
        int n=4;
        int i1=0;
        for(int i=n;i>=1;i--)
        {  
            i1++;
           for(int j=1;j<=2*i-1;j++)
           {
            System.out.print(" * ");   //for stars
            //System.out.print("\uD83D\uDE00");
           }
           System.out.println();
           for(int k=1;k<=i1;k++)   //for spaces
           {
            System.out.print("   ");
           }
        }
    }
    
}

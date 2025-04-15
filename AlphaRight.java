public class AlphaRight {
    public static void main(String[] args) {
        int n=5;
        int ch;
        for(int i=1;i<=n;i++)
        {   ch=64;
            for(int j=1;j<=i;j++) 
            {    ch++;
                System.out.print((char)ch+" ");
            }
            
            System.out.println();
        }
    }
}

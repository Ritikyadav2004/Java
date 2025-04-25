public class FindNumberHaveGreatersumUsingMethods 
{
    static int findNum(int a,int b)
    {   
        int a1=a;
        int b1=b;
        int sum1=0;
        int sum2=0;
        while(a>0)
        {
            int rem = a%10;
            sum1+=rem;
            a=a/10;
        }

        while(b>0)
        {
            int rem1 = b%10;
            sum2+=rem1;
            b=b/10;
        }

        if(sum1>sum2)return a1;
        else return b1;
    }
    public static void main(String[] args) {
        System.out.println( "Maximum Number:"+findNum(122, 123));
    }
}

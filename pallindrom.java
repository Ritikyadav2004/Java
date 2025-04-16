public class pallindrom
{
    public static void main(String[]args)
    {
        int a= 1331;
        int res=0;
        int original =a;
        while(a>0)
        {
            int digit = a%10;
            res = res*10 + digit;
            a/=10;
        } 
        if(original ==res)System.out.print("Pallindrome");
        else System.out.print("Not pallindrome");
    }
}
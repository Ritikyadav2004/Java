public class sumofnumber
{
    public static void main(String[]args)
    {
        int number = 12311;
        int sum=0;
        while(number>0)
        {
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        System.out.print(sum);
    }
}
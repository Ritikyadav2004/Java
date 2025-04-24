public class StrongNumber{
    //145=1!+4!+5!
    public static void main(String[] args) {
        int num  = 145;
        int sum = 0;
        int fact=1;
        int original = num;
        while (num>0)
        {   
            fact = 1;
            int rem = num%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            num/=10;
        }
        if(original==sum)System.out.println("Yay ArmStrong Number:");
        else System.out.println("Not a armstrong number");
    }
}

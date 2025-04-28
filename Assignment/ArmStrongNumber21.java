public class ArmStrongNumber21 {
    public static int cube(int num)
    {   
        int n=1;
        for(int i=1;i<=3;i++)
        {
            n=n*num;
        }
        return n;
    }
    public static int fourth(int num)
    {   
        int n=1;
        for(int i=1;i<=4;i++)
        {
            n=n*num;
        }
        return n;
    }
    public static void Armstromg(int num)
    {
        int sum = 0;
        int org=num;
        while(num>0)
        {
            int rem = num%10;
            sum+=cube(rem);
            num/=10;
        }
        if(sum==org)
        System.out.println("ArmStrong Number");
        else
        System.out.println("Not a Armstrog Number");
    }
    public static void main(String[] args) 
    {
        Armstromg(153);
    }
    
}

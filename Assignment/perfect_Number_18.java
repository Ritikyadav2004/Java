public class perfect_Number_18 {
    public static  void checkperfect(int num)
    {
        int sum=0;
        int original = num;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(original==sum)System.out.println("Perfect Number");
        else System.out.println("Not a Perfecr Number");
    }
    public static void main(String[] args) {
        checkperfect(496);
    }
}

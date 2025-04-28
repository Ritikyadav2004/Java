public class All_Perfect_1_n {
    public static void print_perfect(int num)
    {
        for(int i=1;i<=num;i++)
        {  int sum = 0;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                sum+=j;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        print_perfect(100);
    }
    
}

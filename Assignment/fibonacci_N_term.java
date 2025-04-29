public class fibonacci_N_term {
    public static void main(String[] args) {
        int a = 0;
        int b=1;
        int sum = 0;

        for(int i=0;i<12;i++)
        {
             System.out.print(sum+" ");
             a=b;
             b=sum;
             sum=a+b;
             
        }
    }
    
}

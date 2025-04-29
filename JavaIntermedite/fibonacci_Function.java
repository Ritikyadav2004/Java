public class fibonacci_Function {
    public static void Fibonacci(int n)
    {   
        int a=0;
        int b=1;
        System.out.print(0+" "+1+" ");
        int sum = 0;
        for(int i=1;i<n-2;i++)
        {
            sum = a+b;
           System.out.print(sum+" ");
           a=b;
           b=sum;
        }
        return;
    }
    public static void main(String[] args) {
        Fibonacci(10);
    }
}

public class evenNumber_2 {
    void Number(int a, int b)
    {
        for(int i=a;i<b;i++)
        {
            if(i%2==0)
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        evenNumber_2 m1 = new evenNumber_2();
        m1.Number(1,9);
    }
    
}

public class print_100_Prime
{
   public static void printPrime(int num)
    {

        
        for(int i=2;i<num;i++)
        {   
            boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {   

                if(i%j==0)
                {
                    flag = false;
                   
                    break;
                }
            }
            if(flag)System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printPrime(100);
        
    }
}
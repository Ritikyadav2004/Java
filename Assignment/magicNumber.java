public class magicNumber {
    public static int cube(int num)
    {   
        int fact = 1;
        for(int i=1;i<=3;i++)
        {
          fact = fact*num;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int check = 1729;
        int sum=0;
        boolean flag = true;
        for(int i=1;i<=check/10;i++)
        {
            for(int j=1;j<check/20;j++)
            {
                if(check==(cube(i)+cube(j)))
                {    
                     flag = false;
                     System.out.println(check+" IsMagic number with sum of cube of "+i+" "+j);
                     
                }
            }
            
        }
    }
}

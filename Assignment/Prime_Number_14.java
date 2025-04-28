public class Prime_Number_14 {
    void checkPrime(int num)
    {   
        boolean flag = false;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag = true;
                break;
                
            }
        }
        if(!flag && num>1)System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    public static void main(String[] args) {
        Prime_Number_14 m1 = new Prime_Number_14();
        m1.checkPrime(9);
    }
}

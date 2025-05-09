abstract class payment
{
    abstract  void pay(int a);
     abstract void success();
     
}
class  upipayment extends payment
{
    @Override
    void pay(int a)
    {
       System.out.println(a+" Ruppee Transfered");
    }
    
    @Override
    void success()
    {
        System.out.println("Paymnet Through UPI");
    }
}
class netbankikng extends payment{
   @Override
    void pay(int b)
    {
        System.out.println(b+" Amount transfered");
    }
    @Override
    void success()
    {
        System.out.println("Paymnet Through Netbanking");
    }
}
public class bankPayment {
    public static void main(String[] args) {
        payment p1 = new netbankikng();
        p1.pay(20000);
        p1.success();
        payment p2 = new upipayment();
        p2.pay(100000);
        p2.success();
    }
}

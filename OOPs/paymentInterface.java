interface upi
{
    void showdetails();
}
interface Paymentgateway
{
    void makepayent(int amount);
    void refund(int ruppe);

}
class payple implements  Paymentgateway,upi
{
    @Override    
    public void makepayent(int amount)
    {
        System.out.println(amount+" Successfuly Transferedd througe payple");
    }
    @Override
    public void refund(int ruppe)
    {
        System.out.println(ruppe+" Successfuly Refunded througe payple");
    }
    @Override
    public  void showdetails(){
        System.out.println("UPI via payple");
    }
}
class Stripe implements Paymentgateway,upi
{   
    @Override
    public void makepayent(int amount)
    {
        System.out.println(amount+" Successfuly Transferedd througe Stripe");
    }
@Override
    public void refund(int ruppe)
    {
        System.out.println(ruppe+" Successfuly Refunded througe Stripe");
    }
@Override
    public  void showdetails(){
        System.out.println("UPI via Stripe");
    }
}

class BankTransfer implements Paymentgateway,upi
{  
    @Override
    public void makepayent(int amount)
    {
        System.out.println(amount+" Successfuly Transferedd througe BankTransfer");
    }
    @Override
    public void refund(int ruppe)
    {
        System.out.println(ruppe+" Successfuly Refunded Banktransfer");
    }
    @Override
    public  void showdetails(){
        System.out.println("UPI via Bank");
    }
}
public class paymentInterface {
     public static void main(String[] args)
    {
        payple p1 = new payple();
        p1.makepayent(100000);
        p1.refund(10000);
        p1.showdetails();
        Stripe s1 = new Stripe();
        s1.makepayent(20202);
        s1.refund(23222);
        s1.showdetails();
        BankTransfer b1 = new BankTransfer();
        b1.makepayent(827818);
        b1.refund(3635);
        b1.showdetails();


    }
}

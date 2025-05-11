interface Bicycle // multiple inheritence
{   
    // int a = 99;
    void Break(int decr);
    void speed(int incr);
}
interface hornBicyle // multiple inheritence
{   
    // int a = 99;
   void blowhorn();
   void blowlight();
   
}
class avaonCycle implements Bicycle,hornBicyle{
   
    void horn()
    {
        System.out.println("Pee pee pop pop ");
    }

    @Override
    public void Break(int decr)
    {
        System.out.println("Applying Break");
    }
    
    @Override
    public void speed(int incr)
    {
        System.out.println("Apply speed");
    }
    @Override
    public void blowlight()
    {
        System.out.println("Light on");
    }
    @Override
    public void blowhorn()
    {
        System.out.println("Preparing horn");
    }

}
public class interface_{
    public static void main(String[] args) {
        avaonCycle a1 = new avaonCycle();
        a1.Break(1);
        a1.speed(2);
        a1.horn();
        // System.out.println(a1.a);
        //  a1.a = 67;
        a1.blowhorn();
        a1.blowlight();
    }
}

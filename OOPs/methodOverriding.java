class Parents
{
     void eat()
     {
        System.out.println("Magic");
     }
}
class child extends Parents
{    @Override
     void eat()
     {
        System.out.println("Jaduuu");
     }
}
public class methodOverriding
{
     public static void main(String[] args)
     {
        Parents p1 = new child();
        p1.eat();
     }
}

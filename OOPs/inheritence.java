
class shape
{
    String color;
    public void printcolor()
    {
        System.out.println(color);
    }
}
class trinagle extends shape{
  
}
public class inheritence 
{
    public static void main(String[] args) {
        trinagle t1 = new trinagle();
        t1.color = "red";
        t1.printcolor();
    }
}

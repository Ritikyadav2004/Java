class Area_Calci
{
    double area(int radius)
    {
        return (3.14*radius*radius);
    }
    int area(int len,int widt)
    {
        return (len*widt);
    }
    
}
class circle extends Area_Calci
{
    void  areaofcircle(int radius)
    {
        System.out.println(area(radius));
    }
}

class rectangle extends Area_Calci
{
    void  areaofrect(int len,int widt)
    {
        System.out.println(area(len,widt));
    }
}
public class methodsOverloading
{
    public static void main(String[] args)
    {
        circle c1 = new circle();
        c1.areaofcircle(100);
        rectangle r1 = new rectangle();
        r1.areaofrect(3,4);
    }
}

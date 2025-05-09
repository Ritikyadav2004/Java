abstract class shape 
{
    abstract  void area(int radius);
    abstract void area(int lenght,int widt);
}
class rectangle extends shape
{
    rectangle()
    {
        System.out.println("Rectangle created");

    }
    @Override
    void area(int c)
    {
        System.out.println("Not use radius for araea");
    }
    @Override
    void area(int a, int b)
    {
        System.out.println("Area is :"+a*b);
    }
}

class circle extends shape
{
    circle()
    {
        System.out.println("Circle created");

    }
    @Override
    void area(int b)
    {
        System.out.println("Area is :"+3.14*b*b);
    }
    @Override
    void area(int a, int b)
    {
        System.out.println("Not use len and width for area calulation");
    }
}

public class abstractShape {
    public static void main(String[] args) {
        shape s1 = new rectangle();
        s1.area(3,4);
        s1 = new circle();
        s1.area(22);
    }
}

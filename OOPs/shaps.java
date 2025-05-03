class Shape
{
    void draw(String drw)
    {
        System.out.println("Drawing Shape :"+drw);
    }
}
class Circle extends Shape
{
    void  calculateArea(int r)
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }
}
public class shaps {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw("Circle");
        c1.calculateArea(3);
    }
}
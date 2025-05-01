class calculate
{
    int len1;
    int widt1;
    public calculate(int len,int width )
    { 
        len1 = len;
        widt1=width;
        
    }
    void Area()
    {
        System.out.println("Area of rectangle "+len1*widt1);
    }
    void perimeter()
    {
        System.out.print("Perimeter of rectangle: "+ 2*(len1+widt1));
    }
}
public class areaOfRectangle {
    public static void main(String[] args) {
        calculate m1 = new calculate(5, 9);
        m1.Area();
        m1.perimeter();
    }
    
}

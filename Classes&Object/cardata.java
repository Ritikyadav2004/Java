

class car
{  
    long price;
    String model;
    String Brand;
    public car(String c,String b,int a)
    {
          Brand = c;
          model = b;
          price = a;
    }
    void display()
    {
        System.out.println("Brand:"+ Brand);
        System.out.println("Model:"+ model);
        System.out.println("Price:"+ price);
    }
    
}
public class cardata {
    public static void main(String[] args) {
        car m1 = new car("BMW", "Brave 109", 200000);
        m1.display();
    }
}

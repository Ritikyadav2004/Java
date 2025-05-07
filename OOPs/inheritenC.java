// class animal
// {   
//     void display()
//     {
//         System.out.println("Animal Created");
//     }

// }
// class dog extends animal
// {

//  void dog1()
//  {
//     System.out.println("Dog Created");
//  }
// }

class calculator
{
    void sum(int a, int b)
    { 
        System.out.println("This is Int + Int 2 variable");
        System.out.println(a+b);

    }
    void sum(int a, int b,int c )
    {   
        System.out.println("This is Int + Int 3 variable");
        System.out.println(a+b+c);
        
    }
    void sum(float a, float b)
    {   
        System.out.println("This is float:");
        System.out.println(a+b);
    }
    void sum(double a, double b)
    {   
        System.out.println("This is Double:");
        System.out.println(a+b);
    }
    void sum(int a , float b)
    {   
        System.out.println("this is int + float ");
        System.out.println(a+b);
        
    }

}
public class inheritenC
{
   public static void main(String[] args) {
    // dog d1  =new dog();
    // d1.display();
    // d1.dog1();
    calculator  c1 = new calculator();
    c1.sum(2,3);
    c1.sum(2,3,4);
    c1.sum(8.8f,8.4f);
    c1.sum(9.9,9.8);
    c1.sum(2,8.9 );
    c1.sum(23,9.9f);

   }
}
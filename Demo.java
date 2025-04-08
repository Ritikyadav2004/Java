public class Demo
{   
    public static char ch = 'A'; // static variable
    public static double d1 = 10.5; // static variable
    int a,b; // instance variable
    public Demo(int a1,int b1) // constructor
    {
        a=a1; // instance variable
        b=b1; // instance variable
    }
    public void show()  // instance method(function)
        {
        int A=500; //Local Variable
        System.out.println("Instance Variable: "+a+"--"+b); // instance variable ("+" used to concatenate to variable)
        System.out.println("Local Variable: "+A);  // local variable
    }
    public static void display()
{
  System.out.println("Static Funtion\n");
}
    public static void main(String args[])
    {   
        
        Demo d=new Demo(10,20); // object creation
        d.show(); // instance method calling
        System.out.println("Static variable: "+Demo.ch+"\nStatic Variable: "+Demo.d1); // static variable
        Demo.display(); // static method calling
        //  Demo.main(args); // static method calling Infinte loop
    }
}

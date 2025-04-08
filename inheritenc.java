public class inheritenc 
{   
    public static void main(String [] args)
    {
        b obj = new b();
        obj.show(); // calling show method of class a using object of class b 
        
    }
    static class a{
        a() // constructor of class a
        {
            System.out.println("Constructor of class a"); // constructor to print message
        }
        public void show() // method to show message
        {
            System.out.println("Hello World! Iam a funtion in Class A"); // method to print Hello World
        }
    }
        static class b extends a // class b extends class a
        {
            b() // constructor of class b
            {
                System.out.println("Constructor of class b"); // constructor to print message
            }
            public void show() // method to show message
            {
                System.out.println("Hello World! Iam a funtion in Class b"); // method to print Hello World
            }
        }
    
}

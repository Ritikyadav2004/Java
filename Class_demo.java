//CONSTRUCTOR CN BE OVERLOADED BUT CAN NOT BE OVERRIDEN
//INFINTE CONSTRUCTOR CAN BE CREATED BUT NO CONSTRUCTOR CAN BE OF SMAE TYPE
//NO CALL BY REFRENCE IN JAVA  COZ NO CONECPT OF POINTERS IN JAVA
//ONLY CALL BY VALUE IN JAVA
//hierarchical inheritance is not possible in java coz of constructor
// ONLY DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR CAN BE CREATED IN JAVA
// JAVA IS PURE OBJECT ORIENTED LANGUAGE
//COMPILLER ONLY CREATED DEFULT CONSTRUCTOR FOR CLASS IF NO CONSTRUCTOR IS WRITTEN BY USER
// : in cpp extends : in java for inheritance

public class Class_demo  // main class
{
    Class_demo() // no return type , called automaticlly , same name as that of class
    {
        System.out.println("Hello World! :- Constructor called"); // constructor to print Hello World
    }
    public static void main(String[] args)
    {
       
    Class_demo cd = new Class_demo(); //constructor to create an object of Class_demo
    //withut constructor we not create object by defalut compiler create its own constructor --> called default contructor atuomatically
    cd.show(); // calling show method
    cd.add(5,4);// calling add method with two integers
    cd.add(5.0,4.6);// anothe methd 
    System.out.println("\n"+"Factorial :"+cd.fact(5)); // calling fact method to calculate factorial of 9;
    }
    public void show()
    {
        System.out.println("Hello World!"); // method to print Hello World
    }
    public void add(int a, int b)
    {
        System.out.println("Sum is: " + (a + b)); // method to add two numbers
        System.out.println();
        
    }
    public void add(double a, double b)
    {
        System.out.println("Sum is "+(a+b));

    }
    public int fact(int n)
    {
        if(n==1)
        return 1; // base case for factorial
        
        else{
            return n*fact(n-1); // recursive method to calculate factorial
        }
    }
   

}
import java.util.Scanner;
import java.io.*;
public class Assignement
{
    public static void main(String[]args)
    {
     //Q1find the remiander using modulo opertor
    //  int num = 89;
    //  int num1 = 22;
    //  System.out.println(num%num1);

     //SWAP 2 NUMBER 
    //   int a = 10;
    //   int b = 9;
    //   System.out.println("a:"+a+" b:"+b);
    //   int c;
    //   c=b;
    //   b=a;
    //   a=c;
    //   System.out.println("a:"+a+" b:"+b);

    //Q3 SWAP WITHOUT USING THIRD VARIABLE
    //    int a=10;
    //    int b=9;
    //    System.out.println("a:"+a+" b:"+b);
    //    a=a+b;  //19
    //    b=a-b;  //19=10=9
    //    a=a-b;  //19-9=10
    //    System.out.println("a:"+a+" b:"+b);

    //Q4 check evern and odd
    // int a = 98;
    // if(a%2==0)System.out.println("Even");
    // else System.out.println("odd");
       
   //PRINT ASCII VALUE 
    // char a = 'a';
    // char b = 'b';
    // System.out.println((int)a+(int)b); 

    // int x = 5;
    // double y =6.5;

    // System.out.println(x+y);
    // System.out.println("Enter a character: ");
    //  Scanner sc = new Scanner(System.in);
    //  Char input = sc.next().charAt(0); 
    //  System.out.println(input);
     

    //Q6 Declaere 2 int and 2 float var, add all 4 and print result
    // int a = 19;
    // int b = 20;

    // float c = 10.5f;
    // float d = 9.75f;
    // System.out.println(a+b+c+d); 


    // TAKE A INPUT STRING AND PRINT IT;
    Scanner s =new Scanner(System.in);
    // System.out.print("Enter your name : ");
    // String name = s.next();
    // System.out.print("Enter Your age : ");
    // int age  = s.nextInt();
    // System.out.println("My Name is "+name+" Iam "+age+" year old");
    System.out.println("Enter a character: ");
    char input =s.next().charAt(0);
     System.out.println(input);

     System.out.println((int)(input));
    }  

}

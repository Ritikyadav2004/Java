import java.util.Scanner;
public class Calculator_Java
{
    public static void main(String[] args)
    {
        // taking input from user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Fisrt Number :");
        int a = s.nextInt();
        System.out.print("Enter Second Number:");
        int b = s.nextInt();
        System.out.print("Enter Operator (+, -, *, /, %):");
        char op = s.next().charAt(0);

        // switch case to perform operation
        switch (op)
        {
            case '+':
            System.out.println(a + b);
                
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if(b!=0)
                {
                    System.out.println(a / (float)b);

                }
                else
                {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
             case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Operator");
                break;

        }
        // closing scanner object
         s.close
    }
}
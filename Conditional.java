import java.util.*;// util k ander jitne packege hain unko import karne k liye
public class Conditional 
{   
    public static void main(String[] args)
    {
        // int a = 5;
        // switch (a) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:// case 1-4 same statment 
        //         System.out.println("Hello");
        //         break;
        //     case 5:
        //     System.out.println("hi there");
        //     break;
        //     default:
        //     System.out.println("Byeee");
        //         break;
        // }

          Scanner in=new Scanner(System.in);
        // //  System.out.print("Enter Your in:");

        // //  int  a = in.nextInt();
        // //  System.out.println(a);
        // char b = in.next().charAt(0);
        // System.out.println("Entre Character:");
        // System.out.println(b);;


        //CREATING DAYS
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Day number:");
        int num =s.nextInt();
        switch (num) {
           case 1:
           System.out.println("Monday");
           break;
           case 2:
           System.out.println("Tuesday");
           break;
           case 3:
           System.out.println("Wednesday");
           break;
           case 4:
           System.out.println("Thursday");
           break;
           case 5:
           System.out.println("Friday");
           break;
           case 6:
           System.out.println("Saturday");
           break;
           case 7:
           System.out.println("Sunday");
           break;
           default:
            System.out.println("Invalid Day Number");
                break;
        }

    }
}

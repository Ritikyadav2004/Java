import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.html.StyleSheet;

class tutorial2{
    public static void main(String agrs[])
    {
        // TO PRINT SUM OF SEIRES 2 + 22+ 222 + 2222 + 22222
        // 
        

        //PRINTING ALL COMBINATON OF 1234
        // for(int i=1;i<=4;i++)
        // {
        //     for(int i1=1;i1<=4;i1++)
        //     {
        //         for(int i2=1;i2<=4;i2++)
        //         {
        //             for(int i3=1;i3<=4;i3++)
        //             {
        //                System.out.print(i);
        //                System.out.print(i1);
        //                System.out.print(i2);
        //                System.out.println(i3);                    }
        //         }
        //     }
        //}


        // LCM AND HCF OF TWO NUMBER
        Scanner s= new Scanner(System.in);
        System.out.print("Enter FIsrt number:");
        int num1 = s.nextInt();
        System.out.print("ENter Second Number:");
        int num2 = s.nextInt();
        int smaller;
        // if(num1<num2)
        // {
        //     smaller = num1;
        // }
        // else
        // smaller = num2;
        smaller = (num1<num2)? num1:num2;
        int result=num1*num2;
        int lcm = 0;
        for(int i=smaller;i<=result;i++)
        {
            if(i%num1==0 && i%num2==0)
           { 
            lcm = i;
            System.out.println("LCM of "+num1+" and "+num2+" is "+i);
            break;
            }
        }
         double hcf = (num1*num2)/(float)lcm;
            System.out.print("HCF of "+num1+" and "+num2+" is "+hcf);
  s.close();

    }
}
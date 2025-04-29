
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter 2 Number :");
        Scanner s = new Scanner(System.in);
        int num1= s.nextInt();
        int num2= s.nextInt();
        int num3=0;
        //int max = (num1<num2)?num1:num2;
        for(int i=num1*num2;i>2;i--)
        {
            if(num1%i==0 && num2%i==0)
            { 
                num3 = i;
                System.out.println("HCM :"+i);
                break;
            }

        }
        System.out.print("LCM:"+(num1*num2)/num3);
        s.close();
    }
    
}

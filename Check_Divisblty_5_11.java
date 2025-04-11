import java.util.Scanner;

public class Check_Divisblty_5_11 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ns.nextInt();
        if(n%5==0 && n%11==0)
        {System.out.println("Number Is divisiable  5 and 11");}
        else 
       { System.out.println("Number Is not divisiable by 5 and 11");}
        
    }

    
}

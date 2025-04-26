import java.util.Scanner;

public class UserwantsNumber {
    public static void printNum(int a) {
        System.out.println(a);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 1;
        while (choice!=0) {
            System.out.print("Enter Choice \n1:For Printing Number\n0: For end task:");
            choice = s.nextInt();
            if(choice==1){
                System.out.println("Enter Number:");
                int n = s.nextInt();
                printNum(n);
            }
        }
        s.close();
        
    }
    
}

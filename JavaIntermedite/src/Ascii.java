import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is: " + (int)ch);
        s.close();
    }
    
}

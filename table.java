import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Table of " + n + ":");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}

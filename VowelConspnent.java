import java.util.Scanner;

public class VowelConspnent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = s.nextLine().charAt(0);
        ch = Character.toLowerCase(ch); // Convert the character to lowercase
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel: " + ch);
                break;
        
            default:
            System.out.println("Consonent or special Charatcter: " + ch);
                break;
        }
    }
}

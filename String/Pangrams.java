import java.util.Scanner;

public class Pangrams { // Class name convention: start with uppercase

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        // Convert the entire string to lowercase for case-insensitive checking
        str = str.toLowerCase();

        // Create a boolean array to mark the presence of each letter (a-z)
        // index 0 for 'a', index 1 for 'b', ..., index 25 for 'z'
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a lowercase alphabet letter
            if (ch >= 'a' && ch <= 'z') {
                // Calculate the index for the boolean array
                // 'a' - 'a' = 0
                // 'b' - 'a' = 1
                // ...
                // 'z' - 'a' = 25
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // After checking all characters, iterate through the boolean array
        // to see if all letters from 'a' to 'z' are present
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabetPresent[i]) {
                isPangram = false; // If any letter is not found, it's not a pangram
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
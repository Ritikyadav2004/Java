// Class name should follow PascalCase convention, e.g., Pangrams
public class panagrams {

    public static boolean isPanagram(String str) {
        // A pangram must contain at least 26 characters to hold all letters.
        if (str.length() < 26) {
            return false;
        }

        // Convert to lowercase to handle both 'a' and 'A' as the same letter.
        String lowerStr = str.toLowerCase();

        boolean visited[] = new boolean[26];

        for (int i = 0; i < lowerStr.length(); i++) {
            // The type for a character primitive is 'char' (lowercase).
            char x = lowerStr.charAt(i);

            // Check if the character is a letter from 'a' to 'z'.
            // The original code had 'x > 'a' && x < 'z'', which incorrectly excluded 'a'
            // and 'z'.
            if (x >= 'a' && x <= 'z') {
                // Mark this letter as visited.
                // Yeh line 'x' letter ke corresponding index par 'true' set karti hai.
                visited[x - 'a'] = true;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;

    }

    // Adding a main method to test the function
    public static void main(String[] args) {
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "This is not a pangram";
        String test3 = "Jived fox nymph grabs quick waltz.";

        System.out.println("\"" + test1 + "\" is a pangram: " + isPanagram(test1)); // true
        System.out.println("\"" + test2 + "\" is a pangram: " + isPanagram(test2)); // false
        System.out.println("\"" + test3 + "\" is a pangram: " + isPanagram(test3)); // true
    }
}

public class methods_inString
{
    public static void main(String[] args)
    {
        
        StringBuilder str1 = new StringBuilder("Geeks");
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        // The indexOf() method must be called on the StringBuilder instance
        // and it takes a String argument to se arch for.
        // For example, to find the index of "eek":
        System.out.println(str1.indexOf("eek")); // Output: 1

        // Correctly call the lastIndexOf() method on the str1 instance.
        System.out.println(str1.lastIndexOf("eek")); // Output: 1

        System.out.println(str1.append(8738783));
        System.out.println(str1.reverse());

        // The setCharAt() method returns void, so it cannot be inside println.
        // First, modify the character at index 1 to '9'.
        str1.setCharAt(1, '9');
        // Then, print the modified StringBuilder.
        System.out.println(str1);
    }

}
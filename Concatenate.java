/*
 * String concat function se se merg ho jati he but new object bn ke jab phir se str ko print kenge to purana data he print hot he
 */
public class Concatenate {
    public static void main(String[] args) {
        String str = "Hello"; // Immutabl string
        
        System.out.println(str.concat(" World"));
        
        System.out.println(str);// Output: Hello
    }
}
public class StringBuildr_Uses {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(10); // Mutable
        str.append("Hello  Brothr iam adding more then len its capcity "); // Append 
        System.out.println("Current Capacity After Appending Data of length  "+str.capacity()); // Output: 
        System.out.println("Lenght of the STRING  "+str.length());
        int old = str.capacity(); 
        System.out.println("New Capacity will be  "+old*2 +2+"  Old cpacity *2 +2 capacity include automaticall");
    }
}
//difff between capacity and length (interview question)
// capacity is the size of the string builder object, while length is the number of characters currently stored in it.

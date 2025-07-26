
public class stringbuilder
{
    public static void main(String[] args)
    {
        // You must use the constructor to create a StringBuilder
        StringBuilder str1 = new StringBuilder("Geeks");
        StringBuilder str2 = str1;
        str2.append(str1); // append modifies str2, no need to reassign
       
        if(str1==str2)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
        System.out.println(str2);
        System.out.println(str1);

        str2.append("Hey There Iam Ritik Yadav");
    
         System.out.println(str2);
        
    }
}
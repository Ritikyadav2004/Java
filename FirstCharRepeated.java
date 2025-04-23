import java.util.Scanner;

public class FirstCharRepeated {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = s.nextLine();
        //String str = "ehhelloooo";
        String newstr="";
        boolean  flag = false;
       //convert it into array 
       for(int i=0;i<str.length();i++)
       {
        for(int j=0;j<str.length();j++)
        {
            if(str.charAt(i)==str.charAt(j) && i!=j)
            {   flag =true;
                System.out.print(str.charAt(i));
                break;
            }
        }
        if(flag)
        {
            break;
        }
       }
     
        
    }
}

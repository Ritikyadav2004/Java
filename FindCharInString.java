import java.util.Scanner;

public class FindCharInString 
{
    public static void main(String[] args) 
        
  
{
    String str = "ritik Yadav";
    Scanner s = new Scanner(System.in);
    char ch = s.nextLine().charAt(0);
    boolean flag = false;
    for(int i=0;i<str.length();i++)
    {
         if(ch==str.charAt(i))
         {  flag = true;
            System.out.println(ch+" found at index :"+i);
            break;
         }
    }
    if(!flag)
    System.out.println("Not Found");
}
}

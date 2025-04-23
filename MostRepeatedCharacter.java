import java.util.Scanner;

public class MostRepeatedCharacter 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String:");
        String str= s.nextLine();
        
        char ele =' ';
        // char[] ch= new char[str.length()];
        char[] ch = str.toCharArray();
          int count1 = 0;
          int count2=0;
        for(int i=0;i<ch.length;i++)
        {  count1=0;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && ch[i]!=' ' && ch[j]!=' ')//
                {
                      count1++;
                }
            
            }

        if(count2<count1)
        {
            count2=count1;
            ele = ch[i];
        
            
        }
        s.close();
       
    }
    
    System.out.println("char: "+ele);
    
}
}
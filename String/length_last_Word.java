public class length_last_Word 
{
     public static void main(String[] args) 
     {
        //Scanner s  = new Scanner(System.in);
        //String str = s.next();
        //s.close();
        String str = "hello world  ";
        str = str.trim();
        int len = str.length();
        int sum = 0;
        for(int i=len-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                sum++;
            }
            if(str.charAt(i)==' ')
            break;
        }
    System.out.println(sum);
     }
}

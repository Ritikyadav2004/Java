public class lowerCase_
{   
    public static void main(String[] args) {
        String str[] = {"A","D","C","B"};
        for(int i=0;i<str.length-1;i++)
        {
           for(int j=0;j<str.length-1-i;j++)
           {
            if((int)str[j+1].charAt(0)<(int)str[j].charAt(0))
            {
                String temp  = str[j];
                str[j] = str[j+1];
                str[j+1] = temp;

            }
           }
        }
        for(int i=0;i<str.length;i++)
        {   
            int num = (int)str[i].charAt(0)+32;
            System.out.print((char)num+" ");
        }

    }
}

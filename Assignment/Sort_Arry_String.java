public class Sort_Arry_String
{
    public static void main(String[] args) {
        String [] str = {"ACB","HBHRBHRBBR","DBFRFRJD","DUR RBIRB"};
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                count++;
            }
        }// this loop calculate the total length of string
       // System.out.println(count);
       char [] ch = new char[count];
       
       // converting it into chararater array
       int index = 0;
       for(int i=0;i<str.length;i++)
       {
          for(int j=0;j<str[i].length();j++)
          {
           ch[index] = str[i].charAt(j);
           index++;
          }
       }
      // sorting the array using bubble sort
      for(int i=0;i<count;i++)
      {
        for(int j=0;j<count-1-i;j++)
        {
            if((int)ch[j+1]<(int)ch[j])
            {
                char temp = ch[j+1];
                ch[j+1] = ch[j];
                ch[j] = temp;
            }
        }
      }
       //printing ch
       for(char c:ch)
       {
        System.out.print(c+" ");
       }       
    
    }
}
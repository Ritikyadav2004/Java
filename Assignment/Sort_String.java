public class Sort_String
{
    public static void main(String[] args) {
        String []  str = {"A","B","D","C"};
        char [] arr = new char[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i] = str[i].charAt(0);
        }

        for(int j=0;j<arr.length;j++)  // buble sort
        {
            for(int i=0;i<arr.length-1-j;i++)
            {
                if((int)arr[i+1]<(int)arr[i])
                {
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
       for(int c=0;c<arr.length;c++)
        {
            System.out.println(arr[c]+" ");
        }
    }
}


/*
 * public class Sort_String {

public static void main(String[] args) {
    String [] str ={"A","C","B"};
    // System.out.println(str[2].charAt(0));
    for(int i=0;i<str.length-1;i++)
    {
        for(int j=0;j<str.length-1-i;j++)
        {
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0))
            {
                String temp  = str[j];
                str[j] = str[j+1];
                str[j+1] = temp;
            }
    }
   }  
   for(String c :str)
   {
       System.out.println(c+" ");
   } 

}
}
 * 
 * 
 * 
 */
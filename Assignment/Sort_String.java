public class Sort_String {

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
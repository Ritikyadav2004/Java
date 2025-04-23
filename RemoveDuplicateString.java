public class RemoveDuplicateString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hhllo");
         
         for(int i=0;i<str.length();i++)
         {
            
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(j)==str.charAt(i))
                {
                    str.setCharAt(j, ' ');
                }
            }
         }
         for(int i=0;i<str.length();i++)
         {
             
            
                 System.out.print(str.charAt(i)+"");
             
         }
        // String str = "AGER ELEMENT PRESENT NHI HUA TO HEE -1 RETURN KARGA";
        // System.out.println(str.toLowerCase());
         
      
    }
    
}

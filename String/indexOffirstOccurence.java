public class indexOffirstOccurence 
{
    public static int check(String str1,String str2) {
        
        boolean flag = false;
        int i1=0;
        int j1=0;
       for(int i=0;i<str1.length();i++)
       {
          if(str1.charAt(i)==str2.charAt(j1))
          { 
            i1=i;
            for(int j=i;j<=str1.length()-str2.length();j++)
            {  
                flag = false;
               if(str1.charAt(j)==str2.charAt(j1))
               { j1++;
                flag = true;
               }
               else break;
              
              
            }
          }
          if(flag) break;
       }
       if(flag)
       {
        return i1;
       }
       else{
        return -1;
       }
    }
    public static void main(String[] args) {
        String str1 = "sadsadbut";
        String str2= "bt";
        System.out.println("String 2 start from :"+check(str1,str2)+" Posiion in String 1");
        
    }
}

public class CompareString {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello WorlD";
        boolean flag = true ;
        for(int i=0;i<str.length();i++)
        {    flag = true;
            if(str.charAt(i)!=str1.charAt(i))
            {
                flag = false;
            }
            
            
        }
        if(!flag)System.out.println("String are not equal");
        else System.out.println("String are equal");
        
    }
}

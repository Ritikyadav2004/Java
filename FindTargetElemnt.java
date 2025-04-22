public class FindTargetElemnt {
    public static void main(String[] args) {
        char elemnt = 'R';
        String str = "Hi Ritik ";
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==elemnt)
            {
                count++;
            }
        }
        System.out.println("Character "+elemnt+" is present in string "+count+" times");
    }
    
}

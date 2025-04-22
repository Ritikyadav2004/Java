public class countVowels {
    public static void main(String[] args) {
        String str = "Hello there iam Ritik Yadav";
        String str1 = "aeiouAEIOU";
        int count =0;
        for(int i=0;i<str.length();i++)
        {   
            for(int j=0;j<str1.length();j++)
            {
                if(str.charAt(i)==str1.charAt(j))
                {
                    count++;
                }
            }
           
        }
        System.out.println("Number Of Vowel:"+count);
    }
    
}

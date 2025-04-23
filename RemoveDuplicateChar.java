import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.print("Enter String:");
        // String str = s.nextLine();
        String str = "=hiii";
        //System.out.println(str.indexOf('p')); // return -1
        String newStr = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);  
            //ager element present nhi hua to hee -1 return karga
            if(newStr.indexOf(ch)==-1)//newStr.indexof(ch) return -1 if first char not  present(i=0)
            {                         //newStr.indexof(ch) retrun 0 as i=1, c='h'0==-1 ?
                newStr=newStr+ch;
            }
        }
        System.out.println(newStr);
        s.close();
    }
    
}

public class PallindromString {
    public static void main(String[] args) {
        String str = "NitiN";
        String str1 = "";
    //     for(int i=str.length()-1;i>=0;i--)
    //     {
    //         str1 =str1+str.charAt(i);
    //     }
    //   boolean flag = true;
    // for(int i=0;i<str.length();i++)
    // {    flag = true;
    //     if(str.charAt(i)!=str1.charAt(i))
    //     {
    //         flag = false;
    //         break;
    //     }
        
    // }
    // if(!flag)System.out.println("String are not pallindrom");
    // else System.out.println("String are pallindrom");
//     boolean flag = false;
//     int n = str.length();
//     for(int i=0;i<str.length();i++)
//     {
//    if(str.charAt(i)!=str.charAt(n-i-1))
//    {System.out.println("String are not pallindrom");
//    flag=true;
//     break;
//    }
//     }
//     if(!flag)
//     {
//         System.out.println("String are pallindrom");
//     }


//     standard function
    // String stri = "Nitin";
    // String strm = "Nitin";
    // System.out.println(stri.equals(strm));

    String a = "MadaM";
    char [] b = a.toCharArray();   // to convert it intochar array
    for(int i=0;i<a.length();i++)
    {
       System.out.print(b[i]+" ");
    }

}
}

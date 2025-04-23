public class Stringinformation
    {
        public static void main(String[] args) {
            String str = "Hello";
            String str1 ="Hello";
            //here both object points towrads same memory location
            System.out.println(str==str1);
          
            String str2 = new String("Hi");
            String str3 = new String("Hi");
            System.out.println(str2==str3);
        }

    }
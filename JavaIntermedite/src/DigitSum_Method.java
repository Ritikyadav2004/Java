public class DigitSum_Method {
    void sum_of_digit(int a)  // these is paramete which receie value
    {
      int sum  =0;
      while(a>0)
      {
        int rem = a%10;
        sum+=rem;
        a/=10;
      }


    System.out.println("This is NonStatic function Calling  "+sum);
    }

    static void sum_ofdigit(int a)  // recieving paremeter
    {
        int sum  =0;
        while(a>0)
        {
          int rem = a%10;
          sum+=rem;
          a/=10;
        }
        System.out.println("This is Calling Through with Static Function means no need to calling object "+sum);
    }
    public static void main(String[] args) {
        DigitSum_Method m1  = new DigitSum_Method();
        m1.sum_of_digit(132);  // these is argument sending the value
        sum_ofdigit(132);
        
    }
}

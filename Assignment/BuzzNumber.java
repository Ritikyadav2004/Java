public class BuzzNumber {
    public static void bazz(int a)
    {
      if(a%10==7|| a%7==0)
      {
        System.out.println("Buzz Number");

      }
      else
      System.out.println("Number is not a buzz Number");
    }
    public static void main(String[] args) {
        bazz(71);
    }
}

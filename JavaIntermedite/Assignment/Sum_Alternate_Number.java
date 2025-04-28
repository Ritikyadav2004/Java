public class Sum_Alternate_Number {
    public static int sum(int num)
    {  int sum=0;
        int count = 0;
        while(num>0)
        {
          int rem = num%10;
          count++;
          if(count%2!=0)
          { sum+=rem;}
           num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(12356));
    }
}

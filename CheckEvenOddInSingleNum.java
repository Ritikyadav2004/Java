public class CheckEvenOddInSingleNum {
    public static void main(String[] args) {
        int num = 1234;
        int n = num;
        while(num!=0)
        {
           n=num%10;//takng every last digit;
           if(n%2==0){
            System.out.println("Even Number:"+n);
           }
           else 
            System.out.println("Odd Number :"+n);
           num = num/10;
        }
    }
    
}

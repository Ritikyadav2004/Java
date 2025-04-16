public class HowManyOdd {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5,6,7,8,9};
        int count_odd=0;
        int count_even=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0)
          {
                count_even++;
            }
            else
            {
                count_odd++;
          }
        }
        System.out.println("Odd Count: " + count_odd);
        System.out.println("Even Count: " + count_even);
    }
    
}

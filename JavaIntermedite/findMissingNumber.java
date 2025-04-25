public class findMissingNumber {

    static int find_max(int arr[])
    {  
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
         if(max<arr[i])
         {
            max = arr[i];
         }
        }
        return max;
    }
    static int findmissing(int arr[])
    {
        int ele = find_max(arr);  //taking maximum elemnt of the array
        int sum1 = (ele*(ele+1))/2;  // finding the total sum
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
       sum2+=arr[i];
        }
        return(sum1-sum2);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,8};
        System.out.println("Missing Number in array is : "+findmissing(arr));
    }
    
}

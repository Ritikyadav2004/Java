public class checkPrimeInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,6,7,767,5};
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j=2;j<Math.sqrt(arr[i]);j++)
            {
                if(arr[i]%j==0)
                {
                    flag = false;
                }
            }
            if(flag && arr[i]>1) 
            {
                System.out.println(arr[i]+" is prime");
            }
            else{
                System.out.println(arr[i]+" is not prime");
            }
        }
    }
    
}

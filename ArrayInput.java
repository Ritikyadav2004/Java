import java.util.Scanner;
class ArrayInput {
    
    public static void main(String args []) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+i+" element of the array:");
            arr[i] = s.nextInt();
        }
        System.out.println("Element Insereted:");
        // for finding mximu value
        int max=-1;
        int max_index=0;

        for(int i=0;i<n;i++)
        {   
            if(max<arr[i])
            {
                max=arr[i];
                max_index=i;
            }

            
        }
        System.out.println("First Maximum is :"+max);
        if(max_index!=n-1)    
        {
            int temp = arr[n-1];
            arr[n-1] = arr[max_index];
            arr[max_index] = temp;
        }
      
        

        int max1=-1;
        for(int i=0;i<n-1;i++)
        {
            if(max1<arr[i])
            {
                max1=arr[i];
            }
        }
        System.out.println("Second Maximum value :"+max1);
        // System.out.print("Maximum value in the array is:");
        // System.out.println(max);
        // System.out.print("Second Maximum value in the array is:"+max1);
        s.close();
        
    }
}

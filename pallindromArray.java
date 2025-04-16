public class pallindromArray
 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4,3, 2,1};
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {   flag = false;
                
                break;
            }
            
        }
        if(!flag)System.out.print("Not pallindrom:");
        else System.out.print("Pallindrom:");
    }
    
}

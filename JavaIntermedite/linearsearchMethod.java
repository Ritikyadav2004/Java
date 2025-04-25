public class linearsearchMethod {
    static int linearsearch(int arr[],int ele)
    {  
        
      for(int i=0;i<arr.length;i++)
      {
        if(ele==arr[i])
        {   
            return i;
        }
      }
      return -1;
      
    }
    public static void main(String[] args) {
        int arr[] = {112,23,3,4,54,43,3,23};
        System.out.println(linearsearch(arr,4));
    }
    
}

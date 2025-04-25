public class smallestNumInarrayMethod {
    static int findSmallest(int arr[] )
    {   
        int smaller = arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(smaller>arr[i])
          {
            smaller =arr[i];
          }
        }
        return smaller;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,1};
        System.out.println(findSmallest(arr));
    }
}

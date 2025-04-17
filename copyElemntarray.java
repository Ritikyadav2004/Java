public class copyElemntarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
   System.out.println("Copy of array: ");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr1[i]+" ");
        }
    }
}

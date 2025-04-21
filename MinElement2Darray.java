public  class MinElement2Darray 
{
    public static void main(String[] args) {
        int arr[][]={{12,2,4,56,67,76,54,5},{12,23,44,556,65,43,45,66}};
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(min>arr[i][j])
                min = arr[i][j];
            }
        }
        System.out.println(min);
    }
}
 

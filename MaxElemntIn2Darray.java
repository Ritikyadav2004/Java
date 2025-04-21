public class MaxElemntIn2Darray 
{
    public static void main(String[] args) {
        int arr[][]={{12,2,4,56,67,76,54,5},{12,23,44,556,65,43,45,66}};
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(max<=arr[i][j])
                max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}

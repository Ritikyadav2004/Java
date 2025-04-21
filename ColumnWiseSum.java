public class ColumnWiseSum 
{
    public static void main(String[] args)
    {
        int arr[][] = {{1,1,1,1,1},{2,2,2,2,2}};
        int sum;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum=0;
                sum+=arr[i][j]+arr[i+1][j];
                System.out.println("Sum Of "+(j+1)+" Columns :"+sum);
            }
        }
    }
}

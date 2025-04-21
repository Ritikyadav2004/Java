public class RowWiseSum 
{
    public static void main(String[] args)
    {
        int arr[][] = {{1,1,1,1,1,1,1,1,1,1,},{2,2,2,2,2,2,2,2,2,2}};
        int sum1;
    
        for(int i=0;i<arr.length;i++)
        {   sum1=0;
            for(int j=0;j<arr[i].length;j++)
            {
              //  System.out.print(arr[i][j]);
                sum1+=arr[i][j];
            }
            System.out.println("Sum Of "+(i+1)+" Row :"+sum1);
        }
    }
}

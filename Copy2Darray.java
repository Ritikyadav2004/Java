public class Copy2Darray {
    public static void main (String args[])
    {
        
        int arr2[][] = {{12,23,34,45,56,67},{1,2,3,4,5,6}};
        int row = arr2.length;
        int arr1[][] = new int[2][6];
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
               arr1[i][j] = arr2[i][j];
            }
        }

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
        }
        
    }
    
}

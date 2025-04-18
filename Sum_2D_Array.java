public class Sum_2D_Array {
    public static void main(String[] args) {
        int sum= 0;
        int  arr1[][] = {{1,2,3,4},{1,2,3,4}};
        for(int i=0;i<arr1.length;i++)// by default it return length of row
        {
          for(int j=0;j<arr1[i].length;j++)
          {
            sum+=arr1[i][j];
          }
        }
        System.out.println(sum);
    }
    
}

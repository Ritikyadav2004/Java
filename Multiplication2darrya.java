public class Multiplication2darrya {
    public static void main(String[] args) {
        int mul=1;
        int arr[][]={{1,2,3,4},{1,1,1,1,}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                mul*=arr[i][j];
            }
        }
        System.out.println(mul);
        }
    
}

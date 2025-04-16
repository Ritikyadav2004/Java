public class WhichIndexfive {
    public static void main(String[] args)
    {
      int arr[] = {1, 2, 3, 4, 5};
      int number = 5;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==number && i!=j)
            {
                System.out.println("Pair Found: " + arr[i] + " and " + arr[j]);
                //System.out.print(i+" and "+j);
                break;
            }
        }
      }
    }
    
}

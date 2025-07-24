public class count_Distinct_element {
    public static int countElemnt(int arr[], int len)
    {
  int count =0; boolean isdistinct=true;
  for(int i=0;i<len;i++)
  {isdistinct=true;
    for(int j=i-1;j>=0;j--)
    {
        if(arr[i]==arr[j])
        {
            isdistinct=false;
             break;
        }
    }
    if(isdistinct)
    {
        count++;
    }    
  }
  return count;
    }
  public static void main(String[] args)
  {
     int arr[] = {10,10,20,20,30,30,40,50,50,60};
    // Scanner s = new Scanner(System.in);
    // int len = s.nextInt();// size of array;
    // int arr[]  = new int[len];
    // for(int i=0;i<len;i++)
    // {
    //   arr[i] = s.nextInt();
    System.out.println("Length of distinct element is "+countElemnt(arr,arr.length));
    // }

  }
}

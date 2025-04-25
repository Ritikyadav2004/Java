public class sum_of_maximum_Pair 
{
    static int find_max(int arr[])
    {  
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
         if(max<arr[i])
         {
            max = arr[i];
         }
        }
        return max;
    }// return maximu elemnt
    static int find_2nd_max(int arr[])
    {
        int max = find_max(arr);
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(max==arr[i])
            {
                index = i;
            }
        }
        int temp = arr[0];
        arr[0] = max;
        arr[index]=temp;

    //finding 2nd maximum
        int max2 = arr[1];
        for(int i=1;i<arr.length;i++)
        {
         if(max2<arr[i])
         {
            max2 = arr[i];
         }
        }
        return max2;

    }
    static int find_Pair(int arr[])
    {
        int a = find_max(arr);
        int b= find_2nd_max(arr);
        return a+b;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,6};
        System.out.println(find_Pair(arr)); 
    }
}

public class maximumFROM2Array {
   public static void main(String[] args) {
    
   
    int arr1[] = {1, 2, 3, 4, 5};
    int arr2[] = {2,3,4,5,6};
    int max1=-1;
    int max2=-1;
    for(int i=0;i<arr1.length;i++)
    {
        if(max1<arr1[i])
        {
            max1 = arr1[i];
        }
        if(max2<arr2[i])
        {
            max2 = arr2[i];
        }
            
    }
    if(max1>max2)
        {
            System.out.print("Maximum elemnt of two arrays: "+max1);
        }
        else if(max1==max2)
        {
            System.out.print("Maximum elemnt of two arrays: "+max1);
        }
        else
        {
            System.out.print("Maximum elemnt of two arrays: "+max2);
        }

}
}
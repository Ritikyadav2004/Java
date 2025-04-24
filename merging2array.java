public class merging2array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]= {6,7,8,9,10,11,22,33,44};
        int arr3[]=new int[arr1.length+arr2.length];
        int j=0;
        int k=0;
        for(int i=0;i<(arr1.length+arr2.length);i++)
        {   
            if(j>=arr1.length)
            {
                arr3[i]=arr2[k];
                k++;
            }
            else{
            arr3[i] = arr1[j];
            j++;
            }
        }
        for(int i=0;i<(arr1.length+arr2.length);i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}

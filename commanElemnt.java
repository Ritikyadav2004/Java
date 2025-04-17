public class commanElemnt {
    public static void main(String[] args) {
        int arr1[] ={6,6,6,6,6};
        int arr2[] = {2,4,6,3,8};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr2[j] && i!=j)
                {
                    System.out.println("Common Elemnt:"+arr1[i]+" ");
                    
                }
                
                
            }
           
        }
       
    }
}

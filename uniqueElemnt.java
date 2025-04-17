public class uniqueElemnt 
{
    public static void main(String[] args) 
    {   

        boolean flag =false;
        int arr1[] ={11,22,33,45,8};
        int arr2[] = {2,4,6,3,8};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]!=arr2[j] && i!=j)
                {
                    flag = true;
                    
                }
                          
                
            }
            if(flag)System.out.println("Unique Elemnt in array1:"+arr1[i]+"\nUnique Elemnt in array2:"+arr2[i]);
            
    }
}
}


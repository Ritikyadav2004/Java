public class compareElemnt {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,8,6};
        boolean flag = true;

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                flag = false;
                break;
            }
        }  
        if(!flag)System.out.print("Arrays are not  equal");
        else System.out.print("Arrays are equal");
    }
    
}

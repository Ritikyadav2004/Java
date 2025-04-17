public class Sumof2array {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] ={1,2,3,4,5};
        int sum1=0;
        int n=5;
        for(int i=0;i<arr1.length;i++)
        {
            sum1+=arr1[i];
            sum1+=arr2[n-1-i];
        }
        System.out.println("Sum of two arrays: " + sum1);
    }
}

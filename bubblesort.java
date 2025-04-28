public class bubblesort {
    void sort(int a[])
    {
        int len = a.length;
        for(int i=0;i<a.length-1;i++)
        {   

            System.out.println(i+1+ " Iteration" );
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                   int temp = a[j];
                   a[j]  = a[j+1];
                   a[j+1] = temp;
                   for(int i1:a)
                   { 
                     System.out.print(i1+" ");
                   }
                   System.out.println("");
                   

                }
            }
            
           

        }
     
    }
    public static void main(String[] args) {
        int []arr = {01,9,8,7,6,5,4,3,2,1};
        bubblesort m1 = new bubblesort();
        m1.sort(arr);
    }
}

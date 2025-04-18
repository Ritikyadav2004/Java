import java.util.Scanner;

public class Serching_in_2darray {
    
    public static void main(String[] args) {
        int arr[][]={{12,23,34,45,65,67,78,98},{1,2,3,4,8,9}};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Elemnt to search in 2 Darray:");
        int a  =s.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++)// row
        
        {     // BY DEFAULT IT GIVE TH LENGTH OF ROW 
            for(int j=0;j<arr[i].length;j++)// column
            {
               // System.out.print(arr[i][j]+" ");
                if(a==arr[i][j])
                { flag=true;
                System.out.println("array"+"["+i+"]["+j+"]"+" = "+arr[i][j]);
                break;
                }
    
            }
           
         
        }
        if(!flag)
        {
          System.out.print("Element Not found!!!");
        }
    }
}

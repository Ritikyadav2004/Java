import java.util.Scanner;
public class TwoDarrySearching {
    public static void main(String args[])
    {
        int arr2[][] = {{12,23,34,45,56,67},{1,2,3,4,5,6}};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                if(arr2[i][j] == input)
                {   flag = true;
                    System.out.println("Found at: "+i+" "+j);
                    return;
                }
            }
        }
        if(!flag)
        {
            System.out.println("Not Found");
        }
    }
}

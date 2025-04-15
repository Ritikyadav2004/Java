public class simple_triangle {
    public static void main(String[] args) {
        System.out.println("This codw will prin Normal triangle pattern.");
        int row = 60;
        int column = (2*row) -1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=(column/2)+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
}

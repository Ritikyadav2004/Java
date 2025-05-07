import java.util.Scanner;

class Data
{
    void input(String args)
    {
     System.out.println(args);

    }
    void input(int num)
    {
     System.out.println(num*num);
     
    }
}
public class classAccept
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = s.next();
        int num = s.nextInt();
        Data d1 = new Data();
        d1.input(name);
        d1.input(num);
        s.close();
    }
    
}

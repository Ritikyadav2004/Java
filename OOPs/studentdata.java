import java.util.Scanner;
class data
{
    String name1;
    int roll1;
    int marks1;
    public data(String name,int roll,int marks) {
        name1 = name;
        roll1 = roll;
        marks1 = marks;
    }
    void printdata()
    {
        System.out.println("Name:"+name1);
        System.out.println("Roll Number:"+roll1);
        System.out.println("Marks Obtained:"+marks1);
    }
    
}
public class studentdata {
    
public static void main(String[] args) {
    System.out.println("Enter Student Data");
    Scanner s = new Scanner(System.in);
    System.out.print("Enter name :");
    String name = s.nextLine();
    System.out.print("Enter Roll number :");
    int roll = s.nextInt();
    System.out.print("Enter Marks : ");
    int marks = s.nextInt();
    data m1 = new data(name, roll, marks);
    System.out.println("");
    m1.printdata();
    s.close();
}
}


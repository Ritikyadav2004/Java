class student{
    student()
    {
        System.out.println("hi there");
    }
    student(int a)
    {   this();
        System.out.println(a);

    }
    student(int a, int b)
    {   this(5);
        System.out.println(a+b);
    }

}
public class constructorchaining
{
    public static void main(String[] args) {
        student s1 = new student(56,898);

    }
}

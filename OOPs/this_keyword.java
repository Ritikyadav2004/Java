class student
{
    int a;
    student(int a)
    {
        this.a = a;
    }
    void printstr()
    {
        System.out.println("from student class : "+this.a);
    }
}

public class this_keyword
{
    void sum()
    {
        System.out.println("from this_keywordclass class : "+this);
    }
    public static void main(String[] args) {
        student s1  = new student(10);
        this_keyword obj = new this_keyword();
        s1.printstr();
        obj.sum();
    }
}
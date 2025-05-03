
class person
{
    void displayName(String name)
    {
        System.out.println("Name is :"+name);

    }

}
class student extends person
{
    void displayClass(int cls)
    {
   System.out.println("CLass:"+cls);
    }
}

class moniter extends student
{
    void checkDisciplin()
    {
        System.out.println("Disciplin Checked");
    }
}
public class mulilevelinheritence {
    public static void main(String[] args) 
    {
        moniter m1 = new moniter();
        m1.displayName("Ritik Yadav");
        m1.displayClass(1);
        m1.checkDisciplin();
    }
    
}

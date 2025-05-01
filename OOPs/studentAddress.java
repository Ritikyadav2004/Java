class Address{
    String add;
    
    public Address(String str)
    {
        add = str;
    }
    void printadd()
    {
        System.out.println("Adress :"+add);
    }
}
public class studentAddress {
    public static void main(String[] args) {
        Address stu1 = new Address("Banglore");
        Address stu2= new Address("Jaipur");
        Address stu3 = new Address("Las vegas");
        Address stu4 = new Address("London");
        stu1.printadd();
        stu2.printadd();
        stu3.printadd();
        stu4.printadd();

    }
}

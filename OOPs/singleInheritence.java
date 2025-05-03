class Employee{
    void work(String wrk){
        System.out.println("Person Worked as a :"+wrk);
    }
}
class Manager extends Employee
{
   void attendMeeting()
   {
    System.out.println("Currently attending meeting");
   }
}
public class singleInheritence
{
  public static void main(String[] args) {
    Manager m1  = new Manager();
    m1.work("AI Engineer\n");
    m1.attendMeeting();
  }
}
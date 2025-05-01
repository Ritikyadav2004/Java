class copy{
      String name;
      public copy(copy s2)
      {
        this.name = s2.name;
      }
      public copy()
      {

      }
      void printdata()
      {
        System.out.println(name);
      }
}
public class copyconstructor {
    public static void main(String[] args) {
        copy m1 = new copy();
        m1.name = "Ritik";

        copy m2 = new copy(m1);
        m2.printdata();
        
    }
}
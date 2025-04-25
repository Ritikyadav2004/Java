public class Methods
{     
      void sumFloat(double a, double b)
      {
        System.out.println(a+b);
      }

      static int sum(int a, int b)
      {
           return(a+b);
     }
     public static void main(String[] args) 
     {
         System.out.println(sum(45,54));

        Methods m1 = new Methods();
        m1.sumFloat(99.767, 822.9);
     }
}
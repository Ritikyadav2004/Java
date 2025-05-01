// umber ke digit ke sum if diviso he to number harshad number he 
public class  harshad {
   public static void check(int num)
   {
      int sum = 0;
      int original = num;
      while(num>0)
      {
         int rem = num%10;
         sum+=rem; 

         num/=10;
      }
      if(original%sum==0)
      {
         System.out.println("Harshad");
      }
      else 
      {
         System.out.println("Not a harshad number");
      }
   }
 public static void main(String[] args) {
    check(28);
 }
  
    
}

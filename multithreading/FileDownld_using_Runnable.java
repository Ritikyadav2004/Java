class  Myrunnable implements Runnable
{
      public void run()
      {
         System.out.println("Thread using runnable class:");
      }
}
public class FileDownld_using_Runnable
{
    public static void main(String[] args)
    {
        Myrunnable obj = new Myrunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();  // Mian thread ko block krne ke liye
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occcured");
        }
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
        }
        System.out.println("Main Thread is Running");
    }
}


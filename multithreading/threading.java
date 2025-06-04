class  Myrunnable implements Runnable
{
      public void run()
      {
         System.out.println("Thread using runnable class:");
      }
}

public class threading 
{
    public static void main(String[] args)
    {
        Myrunnable obj = new Myrunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("Main Thread is Running");
    }
}
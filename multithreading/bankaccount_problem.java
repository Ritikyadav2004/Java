class withdraw extends Thread
{
    public static int balance = 1000;
    int amount;
    public withdraw(int amount)
    {
        this.amount=amount;
    }
    public void run()
        {   
            System.out.println("Thread " + Thread.currentThread().getName() + " is running"); 
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
                if(amount<=balance) 
        {        
             System.out.println("Withdrawn " + amount );
             balance-=amount;
             System.out.println( "Remaining balance: " + balance);
        } 
        else
        {
            System.out.println("Not enough money");
        }
           

            

        
    }
}
public class bankaccount_problem
{
    public static void main(String[] args) {
        withdraw t1 = new withdraw(800);
        withdraw t2 = new withdraw(400);
        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}

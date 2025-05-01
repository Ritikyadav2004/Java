import java.util.Scanner;

class BankAccount {

    long accountNumber;
    long balance;

    public BankAccount(long acc, long bal) {
        accountNumber = acc;
        balance = bal;

    }

    void deposit(long acno, long amt) {
        if (acno == accountNumber) {
            balance += amt;
            System.out.println("Balance Added Successfully:" + balance);
        } else
            System.out.println("account not found");
    }

    void withdraw(long  money, long acno) {
        if (acno == accountNumber) {
            if (money <=balance) {
                balance -= money;
                System.out.println(money + " Withdraw Successfully"+"Balance :"+balance);
            } else if (balance == 0) {
                System.out.println("not enough money");
            }

        } else
            System.out.println("account not found");

    }

}

public class Bank {
    /*
     * Create a class BankAccount with fields , accountHolder, and balance.
     * Implement
     * methods to deposit and withdraw money
     */
 public static void main(String[] args)
  {
    BankAccount m1 =  new BankAccount(828197, 100);
    Scanner s = new Scanner(System.in);
    int a = 1;
    while(a!=0)
    {
        System.out.println("Enter Choice:");
        a = s.nextInt();
        if(a==1)
        {   
            System.out.print("Enter acno :");
            long amt = s.nextLong();
            System.out.print("Enter amt");
            long  acno = s.nextLong();
            m1.deposit(amt,acno);
        }
        else if (a==2)
        {
            System.out.print("Enter acno:");
            long  acno = s.nextLong();
            System.out.print("Enter amt:");
            long amt = s.nextLong();
            m1.withdraw(amt,acno);
        }
    }
 }
}

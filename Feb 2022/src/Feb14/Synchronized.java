package Feb14;

class Account
{
    int accno;
    static int balance=500;

    void DisplayBalance()
    {
        System.out.println("*******"
                + ""
                + "****** ACCOUNT BALANCE *************");
        System.out.println("Account Current balance is::"+balance);
    }

    synchronized void Withdraw(int amt)//500
    {
        System.out.println("***************** WITHDRAW ****************");
        System.out.println("Withdrawn amount is::"+amt);
        if(balance<1000){
            System.out.println("SORRY!!! Insufficient balance ::"+balance
                    + "\twaiting for deposit...");

            try{
                wait();
            }catch(Exception e){}
        }

        balance=balance-amt;
        System.out.println("Withdraw Completed...Account Balance::" +balance);//4500
    }

    synchronized void Deposit(int amt)//2000
    {
        System.out.println("**************** DEPOSIT ******************");

        balance=balance+amt;//500+2000=>2500
        System.out.println("Deposited amount is::"+amt);
        System.out.println("Deposit Completely...Account Balance::" +balance);
        notify();
    }
}

class Deposit extends Thread{

    Account acc;

    Deposit(Account acc){
        this.acc=acc;
    }
    public void run(){
        acc.Deposit(2000);
    }
}

class Withdraw1 extends Thread{
    Account acc;
    Withdraw1(Account acc){
        this.acc=acc;
    }
    public void run(){
        acc.Withdraw(500);
    }
}

public class Synchronized {

    public static void main(String[] args) {
        Account a=new Account();
        a.DisplayBalance();//500
        Deposit d=new Deposit(a);//
        Withdraw1 w=new Withdraw1(a);

        w.start();
        d.start();

    }

}
//assignment1=>synchronized block
//==>block and method
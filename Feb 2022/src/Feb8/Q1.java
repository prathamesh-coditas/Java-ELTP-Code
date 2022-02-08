package Feb8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.println("Enter amount to Deposit");
                acc1.deposit(sc.nextInt());
            } catch (InvalidAmountException ae) {
                System.out.println("InvalidAmountException Raised");
            }
            System.out.println("Enter amount to Withdraw");
            acc1.withdraw(sc.nextInt());
            System.out.println("Remaining Balence is::"+acc1.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("InsufficientBalanceException raised");
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}

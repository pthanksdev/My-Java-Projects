import java.util.Scanner;

public class atm {
    public static void displayBalance(int balance){
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    public static int amountWithdrawing(int balance,int withdrawAmount){
        System.out.println("Withdrawal Operations : ");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount){
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        }
        else{
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    public static int amountDepositing(int balance,int depositAmount){
        System.out.println("Deposit Operation : ");
        System.out.println("Depositing Amount : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Enter the withdrawal amount : ");
        System.out.println("Enter the deposit amount : ");
        Scanner scanner = new  Scanner(System.in);
      int balance = 10000;
      int withdrawAmount = scanner.nextInt();
      int depositAmount = scanner.nextInt();
      //calling display balance
        displayBalance(balance);
        balance = amountWithdrawing(balance,withdrawAmount);
        //depositing amount
  //      balance = amountDepositing(balance,depositAmount);
    }
}

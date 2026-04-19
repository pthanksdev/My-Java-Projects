import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int CustomerNumber;
    private int PinNumber;
    private double CheckingBalance =0;
    private double SavingBalance =0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int CustomerNumber){
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }
    public int getCustomerNumber(){
        return CustomerNumber;
    }
    public int setPinNumber(int PinNumber){
        this.PinNumber = PinNumber;
        return PinNumber;
    }
    public int getPinNumber(){
        return PinNumber;
    }

    public double getCheckingBalance(){
        return CheckingBalance;
    }
    public double getSavingBalance(){
        return SavingBalance;
    }
    public double calCheckingWithdraw(double amount){
        CheckingBalance=(CheckingBalance - amount);
        return CheckingBalance;
    }
    public double calSavingWithdraw(double amount){
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
    }
    public  double calCheckingDeposit(double amount){
        CheckingBalance = (CheckingBalance + amount);
        return CheckingBalance;
    }
    public double calSavingDeposit(double amount){
        SavingBalance = (SavingBalance + amount);
        return SavingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        System.out.println("Enter the amount you want to withdraw from your account: ");
        double amount = input.nextDouble();

        if ((CheckingBalance - amount) >= 0){
            calCheckingWithdraw(amount);
            System.out.println("New account Balance is: " +moneyFormat.format(CheckingBalance));
        }else {
            System.out.println("Balance cannot be less than 0.00 " + "\n");
        }
    }
    public void  getSavingWithdrawInput(){
        System.out.println("Saving Account: " + moneyFormat.format(SavingBalance));
        System.out.println(" Please Enter the amount you want to withdraw from your Account: ");
        double amount = input.nextDouble();

        if ((SavingBalance - amount) >= 0) {
            calSavingWithdraw(amount);
            System.out.println("New account Balance is : " + moneyFormat.format(SavingBalance));
        }else {
            System.out.println("Balance cannot be less than 0.00" + "\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        System.out.println("Please Enter the amount you want to deposit: ");
        double amount = input.nextDouble();

        if ((CheckingBalance + amount) >=0){
            calCheckingDeposit(amount);
            System.out.println("New Account Balance is: " + moneyFormat.format(CheckingBalance));
        }else {
            System.out.println("Balance cannot be less than 0.00 " + "\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Savings Balance: " + moneyFormat.format(SavingBalance));
        System.out.println("Please Enter the amount you want to deposit: ");
        double amount = input.nextDouble();

        if ((SavingBalance + amount) >=0){
            calSavingDeposit(amount);
            System.out.println("Your new Savings Balance is " + moneyFormat.format(SavingBalance));
        }else {
            System.out.println("Balance Cannot be less than 0.00 " + "\n");
        }
    }
}



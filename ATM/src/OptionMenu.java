import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner MenuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(21113490,1234);
                data.put(23117880,2233);
                System.out.println("Welcome to Zenith Bank ATM");
                System.out.println("Please Enter your Customer Number");
                setCustomerNumber(MenuInput.nextInt());
                System.out.println("Enter your PIN");
                setPinNumber(MenuInput.nextInt());
            }catch (Exception e){
                System.out.println("\n" + "Invalid Character(s). Only Numbers. " + "\n");
                x=2;
            }
            /*
            *for(Map.Entry<Integer, Integer> it: data.entryset()){
            * if(it.getKey()==getCustomerNumber() && it.getValue()==getPinNumber){
            * getAccountType();}}
            *  */
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn)&& data.get(cn)==pn){
                getAccountType();
            }else
                System.out.println("\n" + "Customer Number or Pin is wrong " + "\n");
        }while (x==1);
    }
    public void getAccountType(){
        System.out.println("Please select your account type: ");
        System.out.println("Press 1.To Check Balance");
        System.out.println("Press 2. For Savings");
        System.out.println("Press 3. To Exist");

        int selection = MenuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for using this ATM. \n ");
                break;

            default:
                System.out.println("\n" +"Invalid Choice. " + "\n");
        }
    }

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Press 1. To Check Balance");
        System.out.println("Press 2. To withdraw Funds");
        System.out.println("Press 3. To Deposit Funds");
        System.out.println("Press 4. to Exist");
        System.out.println("Please Enter your Choice");

        int selection = MenuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM");
                break;

            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getChecking();
        }
    }
    public void  getSavings(){
        System.out.println("Savings Account: ");
        System.out.println("Press 1. To view Balance");
        System.out.println("Press 2. To withdraw Funds");
        System.out.println("Press 3. To Deposit Funds");
        System.out.println("Press 4. To Exist");
        System.out.println("Please Enter Your Choice");

        int selection = MenuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Savings Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            default:
                System.out.println("Invalid Choice");
                getChecking();

        }
    }
}

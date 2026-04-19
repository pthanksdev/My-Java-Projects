import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenue extends Account {
    Scanner MenuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###.00");
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(211113490, 1234);
                data.put(231117880, 2233);
                System.out.println("Welcome to Zenith Bank ATM");
                System.out.println("Please enter your customer Number");
                setCustomerNumber(MenuInput.nextInt());
                System.out.println("Enter your pin");
                setPinNumber(MenuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). Only Numbers. " + "\n");
                x = 2;
            }
          /* for (Map.Entry<Integer,Integer> it: data.entrySet()){
            *  if (it.getKey()==getCustomerNumber && it.getValue()==getPinNumber){
             *   getAccountType();
              } */

            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else
                System.out.println("\n" + "Customer number or pin is wrong " + "\n");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Please select your account type");
        System.out.println("Press 1, For current");
        System.out.println("Press 2, For savings");
        System.out.println("Press 3, To exit");

        int selection = MenuInput.nextInt();

        switch (selection) {
            case 1:
                getCurrent();
                break;

            case 2:
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for using this ATM.\n");
                break;

            default:
                System.out.println("\n" + "Invalid choice." + "\n");
        }
    }

    public void getCurrent() {
        System.out.println("Current Account: ");
        System.out.println("Press 1. To check balance");
        System.out.println("Press 2. To withdraw funds");
        System.out.println("Press 3. To deposit funds");
        System.out.println("Press 4. To exit");
        System.out.println("Please Enter your choice");

        int selection = MenuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance" + moneyFormat.format(getCheckingBalance()));
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
                System.out.println("Thank you for using this ATM.\n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getCurrent();
        }
    }

    public void getSavings() {
        System.out.println("Savings Account: ");
        System.out.println("Press 1. To view balance");
        System.out.println("Press 2. To Withdraw funds");
        System.out.println("Press 3. To Deposit funds");
        System.out.println("Press 4. To Exit");
        System.out.println("Please Enter your choice:");

        int selection = MenuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Savings Account Balance" + moneyFormat.format(getSavingBalance()));
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

            case 4:
                System.out.println("Thank you for using this ATM.\n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                getCurrent();
        }
    }
}
import java.util.Locale;
import java.util.Scanner;

public class atmtransactions {
    public static void main(String[] args) {
        boolean restart = true;
        while (restart) {
            try {
                Scanner scanner = new Scanner(System.in);
                int pin;
                int choice;
                int transaction;
                String AN;
                String B;
                long accno;
                int userpin = 1234;
                int accountbalance = 10000000;

                System.out.println("Enter your pin");
                pin = scanner.nextInt();

                if (userpin == pin) {
                    System.out.println("You have entered the correct pin");
                    System.out.println("Chose your transaction :");
                    System.out.println("1.Withdrawal");
                    System.out.println("2.Deposit");
                    System.out.println("3.Balance Inquiry");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter withdrawal amount :");
                            transaction = scanner.nextInt();
                            System.out.println("Your remaining balance is :");
                            System.out.println(accountbalance - transaction);
                            System.out.println("Transaction Successful");
                            System.out.println("Thank you for banking with us!!!");
                            break;

                        case 2:
                            System.out.println("Enter deposit amount :");
                            transaction = scanner.nextInt();
                            System.out.println("Enter your name : ");
                            AN = scanner.next();
                            System.out.println("Enter your account number :");
                            accno = scanner.nextInt();
                            System.out.println("Enter your bank :");
                            B = scanner.next();
                            System.out.println("Account name : " + AN);
                            System.out.println("Account number : " + accno);
                            System.out.println("Bank : " + B);
                            System.out.println("Your remaining balance is :");
                            System.out.println(accountbalance + transaction);
                            System.out.println("Transaction Successful");
                            System.out.println("Thank you for banking with us!!!");
                            break;

                        case 3:
                            System.out.println("Your account balance is : " + accountbalance);
                            System.out.println("Thank you for banking with us!!!");
                            break;

                        case 4:
                            System.out.println("Leave the website");
                            restart = false;
                            break;
                        default:
                            System.out.println("Theres an error in the website");

                    }
                    if (restart) {
                        System.out.println("Do you want to carry out another transaction?(yes/no)");
                        String response = scanner.next().toLowerCase(Locale.ROOT);
                        if (!response.equals("yes")) {
                            restart = false;
                            System.out.println("Exiting the bank app");
                        }
                    } else {
                        System.out.println("You have entered the incorrect pin");
                    }
                }
            } catch (Exception e) {
                System.out.println("Theres an error in the code");
            }
        }
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CRT tv1 = new CRT();
        LCD tv2 = new LCD();
        int choice;
        System.out.println("we have two TV brands");
        System.out.println("choose what you would like");
        System.out.println("1. CRT");
        System.out.println("2. LCD");
        System.out.println("please enter your choice");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("the sellingprice is : " + tv1.sellingprice());
      //      System.out.println("you have 5% discount on this TV");
    //        System.out.println("The discount on this is : " + tv1.inches());
        }else if(choice == 2){
            System.out.println("the sellingprice : " + tv2.sellingprice());
        }else {
            System.out.println("choose a number between 1 & 2 ");
        }
    }
}



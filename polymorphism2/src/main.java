import java.sql.SQLOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        bmw car1 = new bmw();
        hellcat car2 = new hellcat();
        jaguar car3 = new jaguar();
        int choice;
        System.out.println("we have three models available");
        System.out.println("1. bmw");
        System.out.println("2. hellcat");
        System.out.println("3. jaguar");7
        System.out.println("please enter your choice");
        choice = s.nextInt();
        if (choice==1){
            System.out.println("Top speed of BMW is : " + car1.topSpeed());
        }
        else if (choice==2){
            System.out.println("Top speed of hellcat is : " + car2.topSpeed());
        }
        else if (choice==3){
            System.out.println("Top speed of jaguar is : " + car3.topSpeed());
        }
        else{
            System.out.println("invalid input please enter a number between 1 to 3.");
        }
    }
}

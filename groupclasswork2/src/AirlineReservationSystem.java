import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the airline services");
        System.out.println("What would you like to do?");
        System.out.println("1.Book a flight");
        System.out.println("2.Cancel resservation");
        System.out.println("3.Update Passenger Info");
        System.out.println("4.Display flight schedule");
        System.out.println("5.Search for availables seats");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 :
                System.out.println("");
        }
    }
}

import java.util.Scanner;

public class interfaceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        String day;
        int year;
        int Diesel;
        String location;
        String TripID;
        System.out.println("Enter the date :");
        System.out.println("Enter the month");
        month = scanner.next();
        System.out.println("Enter the day");
        day = scanner.next();
        System.out.println("Enter the year");
        year = scanner.nextInt();
        System.out.println("Enter the amount");
        Diesel = scanner.nextInt();
        System.out.println("Enter the location");
        location = scanner.next();
        System.out.println("Enter the TripID");
        TripID = scanner.next();
        System.out.println("Date :" + day + "/" + month +"/"+ year);
        System.out.println("Location :" + location);
        System.out.println("TripID :" + TripID);
        System.out.println("Diesel :" + Diesel);
    }
}

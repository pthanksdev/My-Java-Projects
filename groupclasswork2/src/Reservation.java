import java.util.Scanner;

public class Reservation {
    int ID;
    int choice;
    int roomID;
    int nextId = 1;
    int getRoomID = 1;
    String name;
    String date;
    public static void reservationInfo(String info){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter the date");
        String date = scanner.next();
        System.out.println();
    }

    public void show(){
        System.out.println("ID= " + ID + "\nName= " + name +
                "\ndate= " + date);
    }
  //  public void showNextId(){
  //      System.out.println("Next customer id will be =" + nextId);
 //   }
  //  protected  void finalize()
  //  {
   //     --nextId;
  //  }

    public static void ResortReservation(int rooms) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book a reservation : ");
        System.out.println("Total amounts of rooms available : " + rooms);
        System.out.println("Enter how many rooms you want to occupy");
        int choice = scanner.nextInt();
        if (choice <= rooms){
            choice = rooms - choice;
       //     System.out.println("Your room ID is " + );
            System.out.println("Please collect your keys and collect the room card");

        }
        else{
            System.out.println("Sorry! We dont have enough rooms for you");
        }
    }
    public static void RailwayReservation(int seats) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book a reservation : ");
        System.out.println("Total amounts of seats available : " + seats);
        System.out.println("Enter how many seat you want to book");
        int choice = scanner.nextInt();
        if (choice <= seats){
            choice = seats - choice;
            //     System.out.println("Your room ID is " + );
            System.out.println("Please collect your tickets at the station");

        }
        else{
            System.out.println("Sorry! We dont have enough seats for you");
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        reservationInfo("info");
        int rooms = 100;
        int seats = 50;
        System.out.println("What would you like to do");
        System.out.println("1.Resort Reservation\n"+"2.Railway Reservation");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("You have choosen 1");
                ResortReservation(rooms);
                break;
            case 2:
                System.out.println("You have choosen 2");
                RailwayReservation(seats);
                break;
            default:
            System.out.println("An error occured");
        }
    }
}


import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        try {
            LinkedList<String> collection = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            collection.add("The lost child");
            collection.add("Who are you?");
            collection.add("Our forgotten souls");
            collection.add("Children of the dark");
            collection.add("Small man");
            //    System.out.print(list);
            //      System.out.println("remove");
            //      list.remove(choice);
            boolean restart = true;
            while (restart) {
                try {
                    int choice;
                    String book;
                    String name, date, title;
                    System.out.println("This is a Library\nWhat would you like to do?");
                    System.out.println("1.Add a new book");
                    System.out.println("2.Search for a book by title/author");
                    System.out.println("3.Display all books");
                    System.out.println("4.Borrow/return a book");
                    System.out.println("5.Remove a book");
                    System.out.println("6.Leave the website");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter a new book");
                            book = scanner.next();
                            collection.add(book);
                            System.out.println("You have entered " + book + " successfully");
                            System.out.println(collection);
                            break;

                        case 2:
                            System.out.println("Enter the author or title of your book: ");
                            book = scanner.next();
                            System.out.println("You have entered " + book);
                            break;

                        case 3:
                            System.out.println("This is a list of all the available books in our collection");
                            System.out.println(collection);
                            break;

                        case 4:
                            System.out.println("Enter the name of the book you are entering");
                            title = scanner.next();
                            System.out.println("Enter the date");
                            date = scanner.next();
                            System.out.println("Enter the name of the customer");
                            name = scanner.next();
                            System.out.println("Name of the book : " + title + "\n" + "Date : " + date +
                                    "\n" + "Name of the customer : " + name);
                            System.out.println("The book was successfully returned");
                            System.out.println("Print Receipt");
                            break;

                        case 5:
                            System.out.println(collection);
                            System.out.println("Enter the name of the book you want to delete");
                            book = scanner.next();
                            collection.remove(book);
                            System.out.println(collection);
                            break;

                        case 6:
                            System.out.println("Leave the website");
                            restart = false;
                            break;
                        default:
                            System.out.println("Theres an error in the website");

                    }
                    if (restart) {
                        System.out.println("Do you want to restart the code?(yes/no)");
                        String response = scanner.next().toLowerCase(Locale.ROOT);
                        if (!response.equals("yes")) {
                            restart = false;
                            System.out.println("Exiting the program");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("There is an error in the code");
                    scanner.nextLine();
                }
            }
            scanner.close();
        }catch (Exception e){
            System.out.println("There is an error in the code");
        }
    }
}
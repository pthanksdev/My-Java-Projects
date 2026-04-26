import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        list.add("NIGERIA");
        list.add("GHANA");
        list.add("NIGER");
        list.add("MALI");
        list.add("CONGA");
        list.add("BUKINA FASO");
    //    System.out.print(list);
        System.out.println("remove");
        String choice = scanner.next();
        list.remove(choice);
        System.out.println(list);
    }
}

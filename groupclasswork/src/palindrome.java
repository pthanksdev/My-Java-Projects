import java.io.IOException;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try {
            String word;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the word");
            word = scanner.nextLine();
            StringBuilder palindromes = new StringBuilder(word);
            palindromes.reverse();
            System.out.println(palindromes);

            if (word.equals(palindromes.toString())) {
                System.out.println("word is a palindrome");
            } else {
                System.out.println("word is not a palindrome");
            }
            scanner.close();
        }catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}

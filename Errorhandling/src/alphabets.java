import java.util.Scanner;

public class alphabets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        String vowel = "aeiou";
        System.out.println("enter the alphabet");
        input = scanner.next();
                        if (input == "a"){
                            System.out.println("it is a vowel");
                              }else if (input == "e"){
                            System.out.println("it is a vowel");
                        }else if(input == "i"){
                        System.out.println("it is a vowel");
                    } else if(input == "o"){
                    System.out.println("it is a vowel");
                    }else if(input == "u"){
                System.out.println("it is a vowel");
            } else {
            System.out.println("it is a consonant");
        }scanner.close();
    }
}
//        string vowel = "aeiou"
   //     System.out.println("vowel.charAt(0)")
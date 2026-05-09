import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        String s = "viannatorres";
        // or String s= new String("viannatorres");

        //Returns the number of characters in the string.
        System.out.println("String length = " + s.length());

        //Returns the character at teh ith index
        System.out.println("Character at the 3rd position = " + s.charAt(6));

        //return the substring from the ith position
        //to end of string
        System.out.println("Substring " + s.substring(6));

        //Returns the substring from i to j-i index
        System.out.println("Substring = " + s.substring(0, 6));

        //Concatenates string2 to the end os string1.
        String s1 = "king";
        String s2 = "joe";
        System.out.println("Concatenated string = " + s1.concat(s2));

        //returns the index within the string
        //of the first occurence of the specified string
        String s4 = "Learn share learn ";
        System.out.println("Index of share " + s4.indexOf("Share"));

        //returns the index within the string of the
        //first occurence of tye specified string
        //starting at the specified index
        System.out.println("Index of a = " + s4.indexOf('a',3));

        //checking equality of strings
        boolean out = "king".equals("kings");
        System.out.println("Checking equality "+ out);
        out = "king".equals("kings");
        System.out.println("Checking Equality " + out);
        out = "KING".equalsIgnoreCase("kings");
        System.out.println("Checkign Equality "+ out);

        //If ACII difference is zero then the strings are similiar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is = "+out1);

        // converting cases
        String word2 = "an kinging";
        System.out.println("Changing to UPPER case " + word2.toUpperCase());

        //Trimming the word
        String word4 = "Learn Share Learn";
        System.out.println("Trim the word "+ word4.trim());

        //Replacing characters
        String str1 = "kingjoe4all";
        System.out.println("Original string " + str1);
        String str2 = "jingjoe4all".replace('j','k');
        System.out.println("Replace f and g -> "+ str2);
    }
}

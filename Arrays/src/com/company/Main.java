package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int testArray[];
            testArray = new int[3];
            testArray[0] = 1;
            testArray[1] = 2;
            testArray[2] = 3;
            System.out.println(testArray[2]);
        }catch (IndexOutOfBoundsException er){
            System.out.println("an out of bound occured");
        }
    }
}

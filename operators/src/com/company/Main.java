package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // System.out.println("hello java");
        //Arithemetic operators
        int myResult = 2 + 2;
        //myResult is now 4
          System.out.println("2+2 = " + myResult);
          int original_result = myResult;

          myResult =myResult - 2;
        //myResult is now 2
          System.out.println(original_result + "-2 = " + myResult);
          original_result = myResult;

          myResult =myResult * 2;
        //myResult is now 4
        System.out.println(original_result + "*2 = " + myResult);
        original_result = myResult;

        myResult =myResult / 2;
        //myResult is now 2
        System.out.println(original_result + "/2 = " + myResult);
        original_result = myResult;

        myResult =myResult + 10;
        //myResult is now 12
        System.out.println(original_result + "+10 = " + myResult);
        original_result = myResult;

        myResult =myResult % 5;
        //myResult is now 2
        System.out.println(original_result + "%5 = " + myResult);
        original_result = myResult;


        //Unary operators
        int result = 1;
        //result is now 1
        System.out.println(result);

        result--;
        //result is now 0
        System.out.println(result);

        result++;
        //result is now 1
        System.out.println(result);

        result = -result;
        //result is now -1
        System.out.println(result);

        boolean success = false;
        //false
        System.out.println(success);
        //true
        System.out.println(!success);

        //pre increment and post increent
        int i =7;
        i++;
        //print 8
        System.out.println(i);
        ++i;
        //print 9
        System.out.println(i);
        //print 10
        System.out.println(++i);
        //print 10
        System.out.println(i++);
        //print 11
        System.out.println(i);

        //comparison operator
        int value1 =2;
        int value2 =4;
        if (value1 == value2) {
            System.out.println("value1 == value2");
        }
        if (value1 != value2) {
            System.out.println("value1 != value2");
        }
        if (value1 > value2) {
            System.out.println("value1 > value2");
        }
        if (value1 < value2) {
            System.out.println("value1 < value2");
        }
        if (value1 >= value2) {
            System.out.println("value1 >= value2");
        }
        if (value1 <= value2) {
            System.out.println("value1 <  = value2");
        }

    //int score = 10
        //System.out.println(++score);
        //System.out.println(score++);
        //System.out.println(score);


    //conditional execution
        int num1 = 20;
        int num2 = 25;
        if((num1 == 20) && (num2 == 25));
        System.out.println("num1 is 20 AND num2 is 25");
        if((num1 == 20) || (num2 == 20));
        System.out.println("num1 is 20 OR num2 is 20");

        //amount = 5000;
       // String day= "sunday";
       // if((amount == 5000) && (day == "sunday"));
       // System.out.println("you are qualified");
        //else
        //System.out.println("you are not qualified");



    }
}
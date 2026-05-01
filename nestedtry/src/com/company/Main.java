package com.company;

public class Main {

    public static void main(String[] args) {
	try{
	    try {
	        try {
	            int arr[] = {1,2,4,6,9};
                System.out.println(arr[8]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException in class 3");
                throw e;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException in class 3");
            throw e;
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException in class 3");
    }finally{
        System.out.println("please check and retry");
    }
    }
}

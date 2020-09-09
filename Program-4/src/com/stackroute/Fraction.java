package com.stackroute;
import java.util.Scanner;
public class Fraction {
    public static String fractionCalculator(int numberOne,int numberTwo){
        int result;
        //calculates fraction of two numbers
        try{
            result = numberOne / numberTwo;
            System.out.println(result);
        }
        //throws arithmeticException if second number is zero
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        System.out.println("Enter first number");
        //reads first number from user
        numberOne=reader.nextInt();
        System.out.println("Enter second number");
        //reads second number from user
        numberTwo= reader.nextInt();
        fractionCalculator(numberOne,numberTwo);
    }
}

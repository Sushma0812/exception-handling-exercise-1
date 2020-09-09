package com.stackroute;
import java.lang.*;
import java.util.*;
public class MyCalculator {
    public static long power(int number,int power) throws Exception
    {
        long result=1;
        //throws exception if number or power is negative
        if(number<0 || power<0)
        {
            throw new Exception("n or p should not be negative");
        }
        //throws exception if both number and power is zero
        else if(number==0 && power==0)
        {
            throw new Exception("n and p should not be zero");
        }
        else
        {
            //calculates power of a number
            for(int i=0;i<power;i++) {
                result = result * number;
            }
        }
        return result;
    }
    public static void main(String args[]) throws Exception {
        Scanner reader=new Scanner(System.in);
        int number,power;
        System.out.println("Enter number");
        number=reader.nextInt();
        System.out.println("Enter power");
        power=reader.nextInt();
        long result;
        result =power(number,power);
        try{
            System.out.println(result);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }
}
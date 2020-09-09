package com.stackroute;
import java.util.Scanner;
public class CharacterFinder {
    public static Character characterLocator(String stringOne, String index) {
        char result =' ';
        //displays character in the given string at given index
        try {
            int position = Integer.parseInt(index);
            result = stringOne.charAt(position);
            System.out.println(result);
        }
        //throws NumberFormatException if index is not a number
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        //throws StringIndexOutOfBound if given index is greater than the length of the string
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBound");
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string");
        //reads a string input from the user
        String string = reader.nextLine();
        System.out.println("Enter index value");
        //reads position from the user
        String position = reader.nextLine();
        characterLocator(string, position);
    }
}

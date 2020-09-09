package com.stackroute;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int arrayLength = 5;
        int size = -1;
        int[] array = null;
        System.out.println("Enter which opertaion to perform");
        int choice = reader.nextInt();
            try {
                switch(choice) {
                    case 0:
                        //throws NullPointerException
                        result = array[0];
                        break;
                    case 1:
                        //throws NegativeArraySizeException.
                        array = new int[size];
                        break;
                    case 2:
                        //throwsArrayIndexOutOfBoundsException
                        for(int i = 0; i<5 ; ++i) {
                            array = new int[arrayLength];
                            result = array[arrayLength];
                        }
                        break;
                    default:
                        System.out.println("Select correct choice");
                }
            }
     catch(NullPointerException e) {
        System.out.println("NullPointerException Exception caught");
    } catch(NegativeArraySizeException e) {
        System.out.println("NegativeArraySizeException Exception caught");
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException Exception caught");
    }
}


}

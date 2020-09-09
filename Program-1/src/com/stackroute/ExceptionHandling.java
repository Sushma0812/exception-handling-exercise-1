package com.stackroute;
//this class contains a method displaying the message stored in the exception object
class Exceptions extends Exception {
    public Exceptions(String string) {
        super(string);
    }
}
class ExceptionHandling{
    public static void main(String[] args) {
        try {
            throw new Exceptions("Hello World");
        } catch (Exception e) {
            System.out.println("e.getmessage()=" + e.getMessage());
        } finally {
            System.out.println("Always execute");
        }
    }
}









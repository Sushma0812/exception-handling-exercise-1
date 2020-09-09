package com.stackroute;
import java.util.Scanner;
class UserExceptionOne extends Exception {
    public UserExceptionOne(String errorMessageOne) {
        super(errorMessageOne);
    }
}
class UserExceptionTwo extends Exception {
    public UserExceptionTwo(String errorMessageTwo) {
        super(errorMessageTwo);
    }
}
public class Account {
    double accountBalance;

    public Account() {
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public static double withdraw(double amount) {
        //initialized balance amount to zero
        double balanceAmount = 0;
        double withdrawAmount;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter withdraw amount");
        withdrawAmount = reader.nextDouble();
        try {
            //calculates balance amount after withdraw
            if (withdrawAmount > 0 && withdrawAmount <= amount) {

                balanceAmount = amount - withdrawAmount;
            }
            //throws InsufficientFundException if withdraw amount is greater than amount
            else if (withdrawAmount > amount) {
                throw new UserExceptionOne("InsufficientFundException");

            }
            //throws NegativeIntegerException if withdraw amount is negative
            else {
                throw new UserExceptionTwo("NegativeIntegerException");

            }
        } catch (UserExceptionOne exceptionOne) {
            System.out.println(exceptionOne);
        } catch (UserExceptionTwo exceptionTwo) {
            System.out.println(exceptionTwo);
        }
        return balanceAmount;
    }
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountBalance(12345.9);
        double amount;
        amount = account.getAccountBalance();
        double finalAmount = withdraw(amount);
        System.out.println(finalAmount);
    }
}

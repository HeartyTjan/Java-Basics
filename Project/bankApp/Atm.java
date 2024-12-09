package bankApp;

import jdk.jfr.DataAmount;

import javax.swing.*;
import java.util.Scanner;

public class Atm {

      public static void main(String[] args) {
        CBN.addNewBank("accessBank", "license1");
        CBN.addNewBank("unionBank", "license2");
        CBN.addNewBank("gtb", "license3");
        gotoMenu();
    }

    public static void gotoMenu(){
        String mainMenu = """
              
               Kowope Microfinance Bank
              ===========================
              1 -> Create Account
              2 -> Deposit Money
              3 -> Withdraw Money1
              4 -> Transfer Money
              5 -> Check Balance
              6 -> ExitApp
              """;

        display(mainMenu);
        forSwitch(input("Enter preferred option: ").charAt(0));

    }

    private static void forSwitch(char userOption){
        switch(userOption){
            case '1': createAccount();break;
            case '2': deposit();break;
            case '3': withdraw();break;
            case '4': displayTransferMenu();break;
            case '5': checkBalance();break;
            case '6': exitApp();break;
            default: display("invalid option");

        }
    }

    private static void displayTransferMenu(){
        display("""
                Transfer Money
               ================
               1-> Access Bank Transfer
               2-> Other Bank Transfer
               """);
       char transferOption =  input("Enter preferred option: ").charAt(0);
       switch(transferOption){
           case '1': intraBankTransfer();break;
           case '2': InterBankTransfer();break;
       }
    }

    private static void InterBankTransfer() {
        String receiverBankName = input("Enter receiver's bank name: ");
        String receiverAccountNumber = input("Enter receiver's account number: ");
        String senderBankName = input("Enter sender's bank name: ");
        String senderAccountNumber = input("Enter sender's account number: ");
        String senderPin = input("Enter sender's pin: ");
        double amount = collectDoubleInput("Enter amount: ");
        CBN.findBank(receiverBankName).interBankTransfer(receiverBankName,receiverAccountNumber,senderBankName,senderAccountNumber,amount,senderPin);
        //CBN.transfer("accessBank",senderAccountNumber,receiverBankName,receiverAccountNumber, amount, senderPin);
        display("Transfer Successful");
        display(String.format("%,2f to %s with %s ", amount,receiverBankName,receiverAccountNumber));

    }

    private static void exitApp() {
        display("Thank you for using Access Bank");
        System.exit(12);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter account number: ");
        String pin = input("Enter pin: ");
        String bankName = input("Enter bank name: ");
        Bank bank = CBN.findBank(bankName);
        try {
            display(String.format("Balance is %,.2f :", bank.findAccount(accountNumber).getBalance(pin)));

        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            checkBalance();
        }
        catch(Exception error){
            display("Please enter a account number");
            checkBalance();
        }
        finally {
            gotoMenu();
        }
    }

    private static double collectDoubleInput(String prompt){

            try {
                return Double.parseDouble(input(prompt));
            } catch (NumberFormatException error) {
                display("Enter a valid amount");
                return collectDoubleInput(prompt);
            }
    }

    private static void intraBankTransfer() {
        String senderAccountNumber = input("Enter sender account number: ");
        String receiverAccountNumber = input("Enter receiver account number: ");
        String pin = input("Enter pin: ");
        double amount = collectDoubleInput("Enter your amount: ");
        String bankName = input("Enter bank name: ");
        Bank bank = CBN.findBank(bankName);

        try {
            bank.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
            display("Transfer successful");
            display(String.format("%.2f transfer to %s: ", amount, receiverAccountNumber));
            display(String.format("Balance is %,.2f", bank.findAccount(senderAccountNumber).getBalance(pin)));

        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            intraBankTransfer();
        }
        finally {
            gotoMenu();

        }
    }

    private static void withdraw() {

        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin: ");
        double amount = collectDoubleInput("Enter your amount to withdraw: ");
        String bankName = input("Enter bank name: ");
        Bank bank = CBN.findBank(bankName);

        try {
            bank.withdraw(amount, accountNumber, pin);
            display("Withdraw Successful");
            display(String.format("Withdrawn %.2f from %s: " , amount, accountNumber));
        }
        catch(IllegalArgumentException error) {
            display(error.getMessage());
            withdraw();

        }
        finally {
            gotoMenu();
        }

    }

    private static void deposit() {
        String accountNumber = input("Enter account number: ");
        double amount = collectDoubleInput("Enter your amount : ");
        String bankName = input("Enter bank name: ");
        Bank bank = CBN.findBank(bankName);

        try {
            bank.deposit(amount, accountNumber);
            display("Deposit Successful");
            display(String.format("Deposited %,.2f to %s", amount, accountNumber));
        }
        catch(IllegalArgumentException error) {
            display(error.getMessage());
        }
       finally {
            gotoMenu();
        }

    }

    private static void createAccount() {
        String firstName = input(("Enter first name: "));
        String lastName = input(("Enter last name: "));
        String phoneNumber = input("Enter phone number");
        String pin = input("Enter pin: ");
        String bankName = input("Enter bank name: ");
        Bank bank = CBN.findBank(bankName);
        try {
            Account newAccount = bank.createAccount(firstName, lastName, pin,phoneNumber);
            display(String.format("Account created with account number : %s", newAccount.getNumber()));
        }
        catch(Exception error) {
            display(error.getMessage());
        }finally {
            gotoMenu();
        }

    }

    private static String input(String value) {
       display(value);
        Scanner receiver = new Scanner(System.in);
        return receiver.nextLine();
//        return JOptionPane.showInputDialog(null, value);
    }

    private static void display(String value) {
        System.out.println(value);
//        JOptionPane.showMessageDialog(null, value);
    }

}

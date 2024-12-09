package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts = new ArrayList<Account>();
    private int numberOfAccounts;
    private String bankName;
    private String licenseNumber;


    public Bank(String bankName, String licenseNumber) {
        this.bankName = bankName;
        this.licenseNumber = licenseNumber;
    }

    public Account createAccount(String firstName, String lastName, String pinCode, String phoneNumber) {
        validateName(firstName, lastName);
        validatePhoneNumber(phoneNumber);
        numberOfAccounts++;
        String accountName = firstName + " " + lastName;
        String accountNumber = generateAccountNumber(phoneNumber);
        Account account = new Account(accountNumber, accountName, pinCode,phoneNumber);
        accounts.add(account);
        return account;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void deposit(double amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) account.deposit(amount);
        else throw new IllegalArgumentException("Account not found");

    }

    public void withdraw(double amount, String number, String correctPin) {
        Account account = findAccount(number);
        if (account != null) account.withdraw(amount, correctPin);
        else throw new IllegalArgumentException("Account not found");
    }

    public void transfer(String senderAccount, String beneficiaryAccount, double amount, String correctPin) {
        Account sender = findAccount(senderAccount);
        Account beneficiary = findAccount(beneficiaryAccount);
        sender.withdraw(amount, correctPin);
        beneficiary.deposit(amount);

    }

    public void interBankTransfer(String receiverBankName,  String receiverAccountNumber,String senderBankName, String senderAccount, double amount, String correctPin) {
        Bank senderBank = CBN.findBank(senderBankName);
        Bank receiverBank = CBN.findBank(receiverBankName);
        Account foundSenderAccount = senderBank.findAccount(senderAccount);
        Account foundReceiverAccount = receiverBank.findAccount(receiverAccountNumber);
        foundSenderAccount.withdraw(amount, correctPin);
        foundReceiverAccount.deposit(amount);

    }


    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) return account;
        }
        throw new IllegalArgumentException(accountNumber + " not found");
    }

//    public Bank findBankByAccountNumber(String accountNumber) {
//        for (){
//            if (bank)
//        }
//    }

    private void checkThereIsNoDuplicateAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) throw new IllegalArgumentException("Account already exists");
        }

    }

    private String generateAccountNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        String generatedAccountNumber = "";
        generatedAccountNumber = phoneNumber.substring(1);
        return generatedAccountNumber;

    }

    private void validatePhoneNumber(String phoneNumber) {
        if(!phoneNumber.matches("[0-9]{11}")) throw new IllegalArgumentException("Phone number must be a digit and should be 11 in length");
        if (phoneNumber.charAt(0) != '0') throw new IllegalArgumentException("Phone number must start with Zero(0)");
    }

    private static void validateName(String firstName,String lastName){
        if(firstName.isEmpty()) throw new IllegalArgumentException("First name cannot be empty");
        if(lastName.isEmpty()) throw new IllegalArgumentException("Last name cannot be empty");
    }

    public String getBankName() {
        return bankName;
    }


}
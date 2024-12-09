package bankApp;

import java.util.ArrayList;
import java.util.List;

public class CBN {
    public static final List<Bank> banks = new ArrayList<>();
    private static int numberOfBanks;

    public static Bank addNewBank(String bankName, String license) {
        Bank bank = new Bank(bankName, license);
        banks.add(bank);
        numberOfBanks++;
        return bank;
    }

    public int getNumberOfBanks() {
        return numberOfBanks;
    }

    public static Bank findBank(String bankName) {
        for(Bank bank : banks){
            if(bank.getBankName().equals(bankName)) return bank;

        }
        throw new IllegalArgumentException(bankName + " not found");
    }

    public static void transfer(String senderBankName, String senderAccountNumber, String receiverBankName, String receiverAccountNumber, double amount, String senderPin) {
        Bank senderBank = findBank(senderBankName);
        Bank receiverbank = findBank(receiverBankName);
        Account SenderAccount= senderBank.findAccount(senderAccountNumber);
        Account receiverAccount = receiverbank.findAccount(receiverAccountNumber);
        senderBank.withdraw(amount,senderAccountNumber, senderPin);
        receiverbank.deposit(amount,receiverAccountNumber);
    }
}
